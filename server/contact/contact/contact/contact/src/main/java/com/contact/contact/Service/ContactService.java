package com.contact.contact.Service;

import com.contact.contact.Repository.ContactRepository;
import com.contact.contact.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContact()
    {
        List<Contact> contacts= new ArrayList<>();
        contactRepository.findAll().forEach(contact  -> contacts.add(contact));
        return contacts;
    }
    public Contact addContact(Contact contact)
    {
        contactRepository.save(contact);
        return contact;
    }
}
