package com.example.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.portfolio.service.ContactService;
import com.example.portfolio.model.Contact;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@CrossOrigin("*")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> getContacts() {
        return contactService.getAllContacts();
    }
}
