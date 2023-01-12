
package com.library.app;


import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		
		Library library=new Library();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
			System.out.println("1.Add Member");
			System.out.println("2.View All Members");
			System.out.println("3.Search Members By Address");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			
			int menuInput=sc.nextInt();
			if(menuInput==1)
			{
				System.out.println("Enter the id");
				int id=sc.nextInt();
				
				System.out.println("Enter the name");
				String name=sc.next();
				
				System.out.println("Enter the address");
				String address=sc.next();
				
				library.addMember(new Member(id, name, address));
			}
			else if(menuInput==2)
			{
				List<Member> viewDetails=library.viewAllMembers();
				viewDetails.forEach(System.out::println);
			}
			else if(menuInput==3)
			{
				System.out.println("Enter the address");
				String address=sc.next();
				List<Member> sortByAddress=library.viewMembersByAddress(address);
				sortByAddress.forEach(System.out::println);
			}
			else
			{
				sc.close();
				break;
			}
        }
	}
}
