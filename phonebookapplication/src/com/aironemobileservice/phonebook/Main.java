package com.aironemobileservice.phonebook;

import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		PhoneBook phoneBook=new PhoneBook();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Add contact");
			System.out.println("2.Display all contacts");
			System.out.println("3.Search contact by phone");
			System.out.println("4.Remove contact");
			System.out.println("5.Exit");
			System.out.print("Enter your choice : ");
		
		    int menuInput=sc.nextInt();
				
			if(menuInput==1)
			{
				System.out.println("Add a contact");
				System.out.print("Enter the First name : ");
				String firstName=sc.next();
				System.out.print("Enter the Last name : ");
				String lastName=sc.next();
				System.out.print("Enter the Phone number : ");
				long phoneNumber=sc.nextLong();
				System.out.print("Enter the Email id : ");
				String emailId=sc.next();
				
				phoneBook.addContact(new Contact(firstName, lastName, phoneNumber, emailId));
			}
			else if(menuInput==2)
			{
				System.out.println("The contacts in the list are :");
				List<Contact> viewAllContacts=phoneBook.viewAllContacts();
				viewAllContacts.forEach(System.out::println);
			}
			else if(menuInput==3)
			{
				System.out.print("Enter the phone number to search contact : ");
				long searchByPhoneNumber=sc.nextLong();
				System.out.println("The contact is :");
				List<Contact> viewDetails=phoneBook.viewContactGivenPhone(searchByPhoneNumber);
				viewDetails.forEach(System.out::println);
			}
			else if(menuInput==4)
			{
				System.out.print("Enter the phone number to remove : ");
				long removeContactsByPhoneNumber=sc.nextLong();
				System.out.print("Do you want to remove the contact (Y/N):");
				char yesOrNo=sc.next().charAt(0);
				if(yesOrNo=='y')
				{
					phoneBook.removeContact(removeContactsByPhoneNumber);
					System.out.println("Contact is successfully deleted");
				}
			}
			else
			{
				sc.close();
				break;
			}
		}
	}
}
