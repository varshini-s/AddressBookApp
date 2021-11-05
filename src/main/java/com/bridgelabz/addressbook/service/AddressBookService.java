package com.bridgelabz.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbook.dto.ContactDTO;
import com.bridgelabz.addressbook.exceptions.AddressBookException;
import com.bridgelabz.addressbook.model.Contact;

import org.springframework.stereotype.Service;
@Service
public class AddressBookService implements IAddressBookService
{

    List<Contact> contactList = new ArrayList<>();

    @Override
    public List<Contact> getContact() 
    {
        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) 
    {
        return contactList.stream()
			   .filter(contact->contact.getContactId()==contactId)
			   .findFirst()
			   .orElseThrow(()->new AddressBookException("Contact not found"));
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) 
    {
        Contact contact = new Contact(contactList.size()+1,contactDTO);
        contactList.add(contact);
        return contact;

    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) 
    {
        Contact contact = this.getContactById(contactId);
        contact.setName(contactDTO.name);
        contact.setAddress(contactDTO.address);
        contact.setPhoneNumber(contactDTO.phoneNumber);
        contact.setCity(contactDTO.city);
        contact.setState(contactDTO.state);
        contact.setZip(contactDTO.zip);

        contactList.set(contactId-1,contact);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) 
    {
        contactList.remove(contactId-1);   
        
    }


}
