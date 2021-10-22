package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain
{
    static AddressBookService service = new AddressBookService();

    public static void main(String[] args)
    {
        boolean isExit = false;
        while (!isExit)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nEnter options\n 1.Add Contact.\n 2.Edit Contact.\n 3.Delete Contact.\n 4.Display Contact.\n 5.Exit.");
            int userInput = scan.nextInt();
            switch (userInput)
            {
                case 1:
                    service.addNewContact();
                    break;
                case 2:
                    service.editContact();
                    break;
                case 3:
                    System.out.println("Enter the name of the person do you wants to delete:");
                    String personName = scan.next();
                    service.deleteContact(personName);
                    break;
                case 4:
                    service.displayList();
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}