package com.bridgelabz;
//service
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookService {
	static Scanner scan = new Scanner(System.in);
	ArrayList<Contact> contactlist = new ArrayList<>();

	public void addNewContact() {
		Contact contact = new Contact();
		System.out.println("Enter First name:");
		contact.setFirstName(scan.next());

		System.out.println("Enter Last Name:");
		contact.setLastName(scan.next());

		System.out.println("Enter Address:");
		contact.setAddress(scan.next());

		System.out.println("Enter City:");
		contact.setCity(scan.next());

		System.out.println("Enter State:");
		contact.setState(scan.next());

		System.out.println("Enter Zip:");
		contact.setZip(scan.next());

		System.out.println("Enter Phone:");
		contact.setPhoneNumber(scan.next());

		System.out.println("Enter Email:");
		contact.setEmail(scan.next());

		contactlist.add(contact);
		System.out.println("Contact Added Successfully");
	}

	public void editContact() {
		String enteredFirstName;
		System.out.println("Enter First name of contact to edit it ");
		enteredFirstName = scan.next();
		for (int i = 0; i < contactlist.size(); i++) {
			if (contactlist.get(i).getFirstName().equals(enteredFirstName)) {
				System.out.println(
						"Enter the field to edit:\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
				int userInput = scan.nextInt();
				switch (userInput) {
				case 1:
					System.out.println("Enter new first name");
					contactlist.get(i).setFirstName(scan.next());
					break;
				case 2:
					System.out.println("Enter new last name");
					contactlist.get(i).setLastName(scan.next());
					break;
				case 3:
					System.out.println("Enter new Address");
					contactlist.get(i).setAddress(scan.next());
					break;
				case 4:
					System.out.println("Enter new city");
					contactlist.get(i).setCity(scan.next());
					break;
				case 5:
					System.out.println("Enter new state");
					contactlist.get(i).setState(scan.next());
					break;
				case 6:
					System.out.println("Enter new zip");
					contactlist.get(i).setZip(scan.next());
					break;
				case 7:
					System.out.println("Enter new phone number");
					contactlist.get(i).setPhoneNumber(scan.next());
					break;
				case 8:
					System.out.println("Enter new email");
					contactlist.get(i).setEmail(scan.next());
					break;
				default:
					System.out.println("Invalid Entry");

				}
			}
		}
		System.out.println("Contact Edited Successfully");
	}

	public void deleteContact(String name) {
		for (int i = 0; i < contactlist.size(); i++) {
			if (contactlist.get(i).getFirstName().equals(name)) {
				Contact contact = contactlist.get(i);
				contactlist.remove(contact);
			}
		}
		System.out.println("Contact Deleted Successfully");
	}

	public void displayList() {
		for (Contact iterator : contactlist)
			System.out.println(iterator);
	}

}
