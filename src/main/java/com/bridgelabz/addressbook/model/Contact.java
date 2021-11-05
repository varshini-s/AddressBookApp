package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.ContactDTO;

public class Contact 
{
	private int contactId;
	private String name;
    private String address;
	private String phoneNumber;
	private String city;
	private String state;
	private String zip;
    
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

	public int getContactId() 
	{
		return contactId;
	}

	public void setContactId(int contactId) 
	{
		this.contactId = contactId;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getZip() 
	{
		return zip;
	}

	public void setZip(String zip) 
	{
		this.zip = zip;
	}


    
    

}
