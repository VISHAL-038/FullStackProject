package com.contact.contact.Repository;

import com.contact.contact.model.Contact;
import org.springframework.data.repository.CrudRepository;


public interface ContactRepository extends CrudRepository<Contact,String> {
}
