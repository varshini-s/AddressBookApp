package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.ContactDTO;

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
    public ResponseEntity<String> getContactData()
    {

        return new ResponseEntity<String>("Get call success",HttpStatus.OK);

    }

    //curl localhost:8080/addressbookservice/get/1 -w "\n"

    @GetMapping("/get/{contactId}")
    public ResponseEntity<String> getContactData(@PathVariable("contactId") int contactId)
    {
        return new ResponseEntity<String>("Get call success for id",HttpStatus.OK);


    }
    //curl -X POST -H "Content-Type: application/json" -d '{"name": "Lisa","salary":2000}' "http://localhost:8080/addressbookservice/create" -w "\n"

    @PostMapping("/create")
    public ResponseEntity<String> addContactData(@RequestBody ContactDTO contactDTO)
    {
        return new ResponseEntity<String>("Created contact data for "+contactDTO,HttpStatus.OK);

    }

    }
}
