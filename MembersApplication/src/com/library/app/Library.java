package com.library.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library
{
	List<Member> memberList =new ArrayList<>();

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	
	public void addMember(Member memberObject)
	{
		memberList.add(memberObject);
	}
	
	public List<Member> viewAllMembers()
	{
		return memberList;
	}
	
	public List<Member> viewMembersByAddress(String address)
	{
		return memberList.stream().filter(s->s.getAddress().equals(address)).collect(Collectors.toList());
	}
}
