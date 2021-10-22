package com.bridgelabz;

public class AddressBookMain {
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        Contacts contact = new Contacts("Raja", "Shekhar", "RKP", "KDL", "TS", 505501, "9032144789", "rajashekhar@gmail.com");
        System.out.println(contact);
    }

}
