package com.contact.contact.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Entity
@Table(name="ContactForm")
public class Contact
{
    @Id
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="subject")
    private String subject;
    @Column(name="message")
    private String message;

    public Contact(){}

    public Contact(String name, String email , String subject , String message)
    {
        this.name=name;
        this.email=email;
        this.subject=subject;
        this.message=message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
