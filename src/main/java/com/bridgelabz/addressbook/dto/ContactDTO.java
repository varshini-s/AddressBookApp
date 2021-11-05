package com.bridgelabz.addressbook.dto;

public class ContactDTO 
{
    public String firstName;
    public String lastName;
    public String address;
    
	public ContactDTO(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ContactDTO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

	

    
    
}
