package com.aironemobileservice.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook 
{
	List<Contact> phoneBook=new ArrayList<>();
	
	public void setPhoneBook(List<Contact> phoneBook)
	{
		this.phoneBook=phoneBook;
	}
	public List<Contact> getPhoneBook()
	{
		return phoneBook;
	}
	
	public void addContact(Contact contact)
	{
		phoneBook.add(contact);
	}
	
	public List<Contact> viewAllContacts()
	{
		return phoneBook;
	}
	
	public List<Contact> viewContactGivenPhone(long phoneNumber)
	{
		return phoneBook.stream().filter(ph->ph.getPhoneNumber()==phoneNumber).collect(Collectors.toList());
	}
	
	public boolean removeContact(long phoneNumber)
	{
		return phoneBook.removeIf(ph->ph.getPhoneNumber()==phoneNumber);
	}
	
	
}
