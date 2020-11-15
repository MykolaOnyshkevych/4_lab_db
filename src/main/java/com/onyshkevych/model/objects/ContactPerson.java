package com.onyshkevych.model.objects;

import com.onyshkevych.model.anotations.Column;
import com.onyshkevych.model.anotations.PrimaryKey;
import com.onyshkevych.model.anotations.Table;
@Table(name = "contact_person")
public class ContactPerson {

    public ContactPerson() {

    }
    public ContactPerson(String firstNamePerson, String lastNamePerson, Integer phoneNumber, String personEmail) {
        this(-1, firstNamePerson, lastNamePerson, phoneNumber, personEmail);
    }

    public ContactPerson(Integer id, String firstNamePerson, String lastNamePerson, Integer phoneNumber, String personEmail) {
        this.id = id;
        this.firstNamePerson = firstNamePerson;
        this.lastNamePerson = lastNamePerson;
        this.phoneNumber = phoneNumber;
        this.personEmail = personEmail;
    }


    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name_person")
    private String firstNamePerson;

    @Column(name = "last_name_person")
    private String lastNamePerson;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "person_email")
    private String personEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstNamePerson() {
        return firstNamePerson;
    }

    public void setFirstNamePerson(String firstNamePerson) {
        this.firstNamePerson = firstNamePerson;
    }

    public String getLastNamePerson() {
        return lastNamePerson;
    }

    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }
    @Override
    public String toString() {
        return "ContactPerson{" +
                "id=" + id +
                ", firstNamePerson='" + firstNamePerson + '\'' +
                ", lastNamePerson='" + lastNamePerson + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", personEmail='" + personEmail + '\'' +
                '}';
    }
}
