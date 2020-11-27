package com.onyshkevych.models;

import javax.persistence.*;

@Entity
@Table(name = "contact_person", schema = "lab5db", catalog = "")
public class ContactPerson {
    private Integer id;
    private String personName;
    private Integer phoneNumber;
    private ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "person_name")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Basic
    @Column(name = "phone_number")
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ContactPerson() {

    }

    public ContactPerson(String personName, Integer phoneNumber, ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.itCompanyVacancyByItCompanyVacancyId = itCompanyVacancyByItCompanyVacancyId;
    }

    public ContactPerson(Integer id, String personName, Integer phoneNumber, ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId) {
        this.id = id;
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.itCompanyVacancyByItCompanyVacancyId = itCompanyVacancyByItCompanyVacancyId;
    }

    @Override
    public String toString() {
        return "ContactPersonEntity{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", itCompanyVacancyByItCompanyVacancyId=" + itCompanyVacancyByItCompanyVacancyId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactPerson that = (ContactPerson) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (personName != null ? !personName.equals(that.personName) : that.personName != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "it_company_vacancy_id", referencedColumnName = "id", nullable = false)
    public ItCompanyVacancy getItCompanyVacancyByItCompanyVacancyId() {
        return itCompanyVacancyByItCompanyVacancyId;
    }

    public void setItCompanyVacancyByItCompanyVacancyId(ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId) {
        this.itCompanyVacancyByItCompanyVacancyId = itCompanyVacancyByItCompanyVacancyId;
    }
}
