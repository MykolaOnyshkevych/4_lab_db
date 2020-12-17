package com.onyshkevych.service;

import com.onyshkevych.domain.ContactPerson;
import com.onyshkevych.repository.ContactPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactPersonService extends GeneralService<ContactPerson> {

    @Autowired
    ContactPersonRepository contactPersonRepository;

    @Override
    public JpaRepository<ContactPerson, Integer> getRepository() {
        return contactPersonRepository;
    }

}