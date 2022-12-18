package  com.address_book_system_using_Oops;

import java.util.Arrays;
import java.util.Scanner;

public class AddBookSys {
    private static Scanner scanner = new Scanner(System.in);
    public static Contact[] contacts = new Contact[20];
    private ContactOperations operations = new ContactOperationImpl();


    public static void main(String[] args) {
        AddBookSys sys = new AddBookSys();
        System.out.println("Welcome to Address Book Management System..!");
        System.out.println();
        sys.addressBookOperations();
    }

    public  void addressBookOperations() {
       boolean isExist = false;
        while (!isExist) {
            System.out.println("Please select options\n1. add contact\n2. edit contact\n3. delete contact\n4. exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    operations.addContact();
                    System.out.println(contacts.toString());
                    break;
                case 2:

                    System.out.println("Enter name to edit");
                    String name = scanner.nextLine();
                    Contact contact = operations.editContact(name);
                    System.out.println(Arrays.toString(contacts));
                    break;
                case 3:
                    System.out.println("Enter name to delete");
                    name = scanner.nextLine();
                    int contactIndexForDelete =operations.findContactByName(name);
                    if (contactIndexForDelete == -1) {
                        System.out.println("Contact not found with name: " + name);
                    } else {
                        contacts[contactIndexForDelete] = null;
                    }
                    System.out.println(Arrays.toString(contacts));
                    break;
                case 4:
                    isExist = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice Please Select Valid Option...!");
            }
        }
    }
}

