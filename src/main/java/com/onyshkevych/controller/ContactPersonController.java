package com.onyshkevych.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.onyshkevych.persistant.ConnectionManager;
import com.onyshkevych.model.objects.ContactPerson;
import com.onyshkevych.service.ContactPersonService;
public class ContactPersonController extends GeneralController<ContactPerson, Integer, ContactPersonService>{
    public ContactPersonController(){
        super(ContactPersonService.class);
    }
    public List<ContactPerson> findByName(String firstNamePerson, String lastNamePerson) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<ContactPerson> people = new ContactPersonService().findByName(firstNamePerson, lastNamePerson);
        connection.close();
        return people;
    }
}
