package AddressBookSystemWorkShop;

/**
* UC1 :- Ability to create a Contacts in Address Book with first and last names, address,
*        city, state, zip, phone number and email
* UC2 :- Ability to add a new Contact to Address Book
* UC3 :- Ability to edit existing contact person using their name
* UC4 :- Ability to delete a person using person name
*/

/**
* import scanner class
*/
import java.util.Objects;
import java.util.Scanner;

/** 
* create a class name as AddressBookMain
*/
public class Executor {
   
   private static Scanner sc = new Scanner(System.in);
   
   static ContactService contactService;
   
   static AddressBook addressBook;

   
   public static void findContact() {
       
       System.out.println("Enter Person Name");
       String name = sc.nextLine();
       
       contactService.displayContact(addressBook.searchByName(name));
   }

   /**
    * create a method editContact
    */
   public static void editContact() {
       /**
        * enter the person name
        */
       System.out.println("Enter Person Name");
       String name = sc.nextLine();
       /**
        * search this person by name in addressbook and if this is found then store in contact
        */
       Contact contact = addressBook.searchByName(name);
      
       if(Objects.nonNull(contact)) {
           
           contactService.editExistingContact(contact);
           return;
       }
       
       System.out.println("Person Not Found");
   }

   /**
    * create a method  delete Contact
    */
   public static void deleteContact() {
       
       System.out.println("Enter Person Name");
       String name = sc.nextLine();
       
       if(Objects.nonNull(addressBook.searchByName(name))){
           
           addressBook.deleteContact(name);
           return;
       }
       
       System.out.println("Person Not Found");
   }

    
   public static void createContact() {
      
       addressBook.addContact(contactService.createContact());
   }

     public static void main(String[] args) {
       
       System.out.println("Welcome to Address Book System");
       System.out.println("______________________________");
       
       addressBook = new AddressBook();
       /**
        * create object for ContactService class,object name as contact Service
        */
       contactService = new ContactService(sc);
       System.out.println("Contact is added to addressBook");

       
       boolean repeat = true;
       
       while (repeat) {
           
           System.out.println(
                   "\nAddress Book Options:\n1 (Add new contact)\n2 (Edit existing contact)\n3 (Delete a contact)\n4 (View all contact)\n5 (Display contact)\n6 Exit");
           int option = Integer.parseInt(sc.nextLine());
           /**
            * using switch case
            */
           switch (option) {
               
               case 1:
                   /**
                    * create a contact
                    */
                   createContact();
                   break;
               
               case 2:
                   
                   editContact();
                   break;
                             case 3:
                   /**
                    * delete contact in address book
                    */
                   deleteContact();
                   break;
               
               case 4:
                   
                   System.out.println(addressBook);
                   break;
               
               case 5:
                   
                   findContact();
                   break;
               
               case 6:
                   
                   repeat = false;
                   System.out.println("Exit");
                   break;
               
               default:
                   System.out.println("Invalid Entry");
           }
       }
   }
}