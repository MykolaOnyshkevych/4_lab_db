package com.onyshkevych.controller;

import com.onyshkevych.domain.ContactPerson;
import com.onyshkevych.service.ContactPersonService;
import com.onyshkevych.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/contact")
public class ContactPersonController extends GeneralController<ContactPerson> {

    @Autowired
    ContactPersonService contactPersonService;

    @Override
    public ServiceInterface<ContactPerson> getService() {
        return contactPersonService;
    }

}