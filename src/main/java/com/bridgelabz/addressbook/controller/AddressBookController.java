package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.ContactDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.Contact;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController 
{

	// curl localhost:8080/addressbookservice/ -w "\n"

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getContactData()
    {
        Contact contact = new Contact(1,new ContactDTO("Ted","Mosby","Abc street,12th cross"));
        ResponseDTO response = new ResponseDTO("Get call success",contact);
        return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);

    }

    //curl localhost:8080/addressbookservice/get/1 -w "\n"

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactData(@PathVariable("contactId") int contactId)
    {
        Contact contact = new Contact(1,new ContactDTO("Ted","Mosby","Abc street,12th cross"));
        ResponseDTO response = new ResponseDTO("Get call success for id",contact);
        return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);


    }
    //curl -X POST -H "Content-Type: application/json" -d '{"firstName": "Lisa","lastName": "Anne","address":"abc street,4th cross"}' "http://localhost:8080/addressbookservice/create" -w "\n"

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContactData(@RequestBody ContactDTO contactDTO)
    {
        Contact contact = new Contact(1,contactDTO);
        ResponseDTO response = new ResponseDTO("Created contact data for",contact);
        return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);

    }

    //curl -X PUT -H "Content-Type: application/json" -d '{"firstName": "Lisa","lastName": "Anne","address":"abc street,4th cross"}' "http://localhost:8080/addressbookservice/update/1" -w "\n"
    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,@RequestBody ContactDTO contactDTO)
    {
        Contact contact = new Contact(1,contactDTO);
        ResponseDTO response = new ResponseDTO("Updated contact data for",contact);
        return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);

    }

    //curl -X DELETE -H "Content-Type: application/json" localhost:8080/addressbookservice/delete/1 -w "\n"
    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId)
    {
        ResponseDTO response = new ResponseDTO("Delete call success for id ","deleted id:"+contactId);
        return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);
        
    }
}
