package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<Contact,Integer>
{

}
