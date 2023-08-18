package com.contact.contact.Controller;

import com.contact.contact.Service.ContactService;
import com.contact.contact.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ContactController
{
    @Autowired
    private ContactService contactService;

    @RequestMapping(method = RequestMethod.GET, value ="./contacts")
    public List<Contact> getAllContact()
    {
        return contactService.getAllContact();
    }

    @RequestMapping(method = RequestMethod.GET, value ="./contacts")
    public Contact addContact(@RequestBody Contact contact)
    {
        return contactService.addContact(contact);
    }

}
