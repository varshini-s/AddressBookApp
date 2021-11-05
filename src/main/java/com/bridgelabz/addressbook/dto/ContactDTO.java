package com.bridgelabz.addressbook.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ContactDTO 
{
	@NotEmpty(message = "Contact name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$",message = "first name Invalid")
    public String firstName;

	@NotEmpty(message = "Contact name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$",message = "last name Invalid")
    public String lastName;
	
	@Pattern(regexp = "(?!^\\d+$)^[A-Z,a-z,0-9, ()#-]{3,}$",message = "Address Invalid")
    public String address;
    
	public ContactDTO(String firstName, String lastName, String address) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "ContactDTO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

	

    
    
}
