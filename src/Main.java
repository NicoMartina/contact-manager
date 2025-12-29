import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        ContactManager cm = new ContactManager();

        cm.loadFromFile();

        while (option != 5){

            System.out.println("=== Contact Manager ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.println("Choose option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    String number = scanner.nextLine();
                    cm.addContact(firstName, lastName, number);
                    break;
                case 2:
                    cm.viewAllContacts();
                    break;

                case 3:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    cm.searchContact(name);
                    break;

                case 4:
                    System.out.println("Enter name: ");
                    String nameToDelete = scanner.nextLine();
                    cm.deleteContact(nameToDelete);
                    break;

                case 5:
                    cm.saveToFile();
                    System.out.println("Goodbye!");

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();


    }
}
