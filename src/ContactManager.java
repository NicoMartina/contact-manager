import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContactManager {

    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String firstName, String lastName, String number) {
        Contact newContact = new Contact(firstName, lastName, number);
        contacts.add(newContact);
        System.out.println("Contact added successfully");
    }

    public void viewAllContacts(){
        for ( Contact c : contacts){
            System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());
            System.out.println("Phone number: " + c.getPhoneNumber());
            System.out.println(" --------");
        }
    }

    public void searchContact(String name){
        if (contacts.isEmpty()){
            System.out.println("There are no contacts");
            return;
        }

        boolean found = false;
        for (Contact c : contacts){
           if (c.getFirstName().equalsIgnoreCase(name)){
               System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());
               System.out.println("Phone Number: " + c.getPhoneNumber());
               System.out.println("------------");
               System.out.println();
               found = true;
           }
        }

        if (!found){
            System.out.println("No contact with the name: " + name);
            System.out.println("-----");
            System.out.println();
        }

    }

    public void deleteContact(String name){
        if ( contacts.isEmpty()){
            System.out.println("Your contacts is empty");
            return;
        }
        boolean found = false;
        for (int i = contacts.size() - 1; i >= 0; i--) {
            Contact c = contacts.get(i);
            if (c.getFirstName().equalsIgnoreCase(name)){
                contacts.remove(i);
                System.out.println("Deleted " + c.getFirstName() + " " + c.getLastName());
                System.out.println("--------");
                found = true;
            }
        }

        if (!found){
            System.out.println("No contact with name: " + name);
        }

    }
}
