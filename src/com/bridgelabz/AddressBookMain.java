package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	Contacts contacts;
	private void addContact() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name :-");
		String firstName = scan.nextLine();
		System.out.println("Enter your Last name :-");
		String lastName = scan.nextLine();
		System.out.println("Enter The Address :- ");
        String address = scan.nextLine();
        System.out.println("Enter The City :- ");
        String city = scan.nextLine();
        System.out.println("Enter The State :- ");
        String state = scan.nextLine();
        System.out.println("Enter The Zip Code :- ");
        int zipCode = scan.nextInt();
        System.out.println("Enter The Mobile Number :- ");
        String number = scan.next();
        System.out.println("Enter The Email-id :- ");
        String email = scan.next();
        contacts = new Contacts(firstName, lastName, address, city, state, zipCode, number, email);
        System.out.println("contact Sucussfully added");
		
	}
	
	public String toString() {
		return contacts.toString();
	}
	
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        AddressBookMain addressBook = new AddressBookMain();
        addressBook.addContact();
         System.out.println(addressBook.toString());
        
    }

}
