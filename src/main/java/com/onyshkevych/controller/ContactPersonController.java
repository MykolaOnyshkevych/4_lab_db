package com.onyshkevych.controller;

import com.onyshkevych.service.ContactPersonService;
import com.onyshkevych.models.ContactPerson;
public class ContactPersonController extends GeneralController<ContactPerson, Integer, ContactPersonService> {
    public ContactPersonController() {
        super(ContactPersonService.class);
    }
}
