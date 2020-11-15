package com.onyshkevych.service;
import java.sql.SQLException;
import java.util.List;
import com.onyshkevych.DAO.ContactPersonDAOImp;
import com.onyshkevych.model.objects.ContactPerson;
public class ContactPersonService extends GeneralService<ContactPerson,Integer, ContactPersonDAOImp>{
    public ContactPersonService() {
        super(ContactPersonDAOImp.class);
    }
    public List<ContactPerson> findByName(String firstNamePerson, String lastNamePerson) throws SQLException {
        return new ContactPersonDAOImp().findByName(firstNamePerson, lastNamePerson);
    }
}
