package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static void createContact() {
        ArrayList<String> firstContact = new ArrayList<String>(7);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the contact details  : ");
        System.out.println("Name Address City State Zipcode PhoneNo EmailId  : ");
        for (int i = 0; i < 7; i++) {
            String r = s.nextLine();
            firstContact.add(r);
        }
        System.out.println(firstContact);
    }

    public static void main(String[] args) {
        AddressBook contact =new AddressBook();
        contact.createContact();
    }
}
