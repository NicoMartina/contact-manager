import java.io.File;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

public class ContactManager {

    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String firstName, String lastName, String number) {
        try {
            Contact newContact = new Contact(firstName, lastName, number);
            contacts.add(newContact);
            System.out.println("Contact added successfully");
        } catch (IllegalArgumentException e){
            System.out.println("Cannot add contact: " + e.getMessage());
        }
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

    public void saveToFile(){
        try{
            FileWriter writer = new FileWriter("contacts.txt");
            for (Contact c : contacts){
                writer.write(c.getFirstName() + "," +
                        c.getLastName() + "," +
                        c.getPhoneNumber() + "\n");
            }
            writer.close();
            System.out.println("Contacts saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    public void loadFromFile(){
        File file = new File("contacts.txt");
        if (!file.exists()) {
            return;
        }
        Scanner scanner = new Scanner("contacts.txt");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            if (parts.length == 3) {
                String firstName = parts[0];
                String lastName = parts[1];
                String phoneNumber = parts[2];
                contacts.add(new Contact(firstName, lastName, phoneNumber));
            }
        }
        scanner.close();
        System.out.println("Contacts loaded successfully.");
    }
}
