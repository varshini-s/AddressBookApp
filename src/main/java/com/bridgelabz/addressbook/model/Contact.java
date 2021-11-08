package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.ContactDTO;

import lombok.Data;

public @Data class Contact 
{
	private int contactId;
	private String name;
    private String address;
	private String phoneNumber;
	private String city;
	private String state;
	private String zip;

	public Contact()
	{

	}
    
	public Contact(int contactId,ContactDTO contactDTO) 
	{
		this.contactId = contactId;
		this.name = contactDTO.name;
		this.address = contactDTO.address;
		this.phoneNumber = contactDTO.phoneNumber;
		this.city = contactDTO.city;
		this.state = contactDTO.state;
		this.zip = contactDTO.zip;
	}


}
