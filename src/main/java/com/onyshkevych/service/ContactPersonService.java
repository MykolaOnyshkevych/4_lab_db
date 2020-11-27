package com.onyshkevych.service;

import com.onyshkevych.DAO.ContactPersonDAOImp;
import com.onyshkevych.models.ContactPerson;

public class ContactPersonService extends GeneralServiceImp<ContactPerson,Integer, ContactPersonDAOImp>{
    public ContactPersonService() {
        super(ContactPersonDAOImp.class);
    }
}