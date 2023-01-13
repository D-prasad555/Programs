package com.insurancebazar.app;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
	public static void main(String[] args) 
	{
		InsuranceBazar insuranceBazar=new InsuranceBazar();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add insurance policies");
			System.out.println("2.View Policies");
			System.out.println("3.Search policy types");
			System.out.println("4.Exit");
			int menuInput=sc.nextInt();
			if(menuInput==1)
			{
				int count=1;
				System.out.println("Enter the number of policy names you want to store");
				int noOfPolicies=sc.nextInt();
				while(count<=noOfPolicies)
				{
					System.out.println("Enter the policy Id");
					int policyId=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the policy name");
					
					String policyName=sc.nextLine();
					sc.nextLine();
					PolicyDetails policyDetails=new PolicyDetails(policyId, policyName);
					insuranceBazar.addPolicyDetails(policyDetails);
					count++;
				}
			}
			else if(menuInput==2)
			{
				Map<Integer, String> viewAllDetails=insuranceBazar.viewAllPolicyDetails();
				System.out.println("Policy Id"+" "+"Policy Name");
				for(Map.Entry<Integer, String>  details : viewAllDetails.entrySet())
				{
					System.out.println(details.getKey()+"      "+details.getValue());
				}
			}
			else if(menuInput==3)
			{
				System.out.println("Enter policy type to search");
				String searchInput=sc.next();
				Map<Integer, String> searchBasedOnPolicyType=insuranceBazar.searchBasedOnPolicyType(searchInput);
				List<Integer> policyId=searchBasedOnPolicyType.entrySet().stream().map(s->s.getKey()).collect(Collectors.toList());
				policyId.forEach(System.out::println);
			}
			else
			{
				sc.close();
				break;
			}
			
		}
	}
}
