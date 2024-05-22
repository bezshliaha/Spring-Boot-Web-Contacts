package com.example.app.SpringBootWebContacts.service;

import com.example.app.SpringBootWebContacts.entity.Contacts;
import com.example.app.SpringBootWebContacts.repository.ContactRepository;
import com.example.app.SpringBootWebContacts.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;

    public List<Contacts> getContacts() {
        Iterable<Contacts> iterable = repository.findAll();
        List<Contacts> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(contacts -> new Contacts(contacts.getId(),
                                Constants.URL_IMAGES + contacts.getImg(),
                                contacts.getName(),
                                contacts.getLastName(),
                                contacts.getAlias()))
                        .toList();
        return new ArrayList<>(list);
    }
}

