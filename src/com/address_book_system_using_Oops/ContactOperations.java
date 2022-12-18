package com.address_book_system_using_Oops;

public interface ContactOperations {
    Contact addContact();
    Contact editContact(String name);
    int findContactByName(String name);
}



