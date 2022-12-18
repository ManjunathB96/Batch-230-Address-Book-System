package com.address_book_system_using_Oops;

import java.util.Scanner;

import static com.address_book_system_using_Oops.AddBookSys.contacts;

public class ContactOperationImpl implements ContactOperations {
    private Scanner scanner;

    public ContactOperationImpl() {
    }

    @Override
    public Contact addContact() {

        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();    //constructor is created in contact class (empty)
        System.out.println("Enter First Name :");
        contact.setfName(scanner.nextLine());

        System.out.println("Enter Middle Name :");
        contact.setmName(scanner.nextLine());

        System.out.println("Enter Last Name :");
        contact.setlName(scanner.nextLine());

        System.out.println("Enter Residential address :");
        contact.setAdd(scanner.nextLine());

        System.out.println("Enter City Name  :");
        contact.setCity(scanner.nextLine());

        System.out.println("Enter State  Name :");
        contact.setState(scanner.nextLine());

        System.out.println("Enter Country Name :");
        contact.setCountry(scanner.nextLine());

        System.out.println("Enter PinCode :");
        contact.setPinCode(scanner.nextInt());

        System.out.println("Enter Phone Number :");
        contact.setPhoneNum(scanner.nextLong());

        System.out.println("Enter Email Address:");
        contact.setEmail(scanner.nextLine());

        for (int i = 0; i < contacts.length-1; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                System.out.println("Contact Added Successfully in Address book system....!");
                return contact;
            }
        }
        System.out.println("Contact List is Full No Space For New Contacts");
        return contact;
    }

    @Override
    public Contact editContact(String name) {
        System.out.println("Edit first name");
        int index = findContactByName(name);
        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();
        contacts[index].setfName(str);
        return contacts[index];
    }

    @Override
    public int findContactByName(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getfName().equals(name) ||
                        contacts[i].getlName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;

    }
}
