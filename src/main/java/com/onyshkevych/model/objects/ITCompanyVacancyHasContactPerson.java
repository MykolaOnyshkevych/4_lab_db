package com.onyshkevych.model.objects;
import com.onyshkevych.model.anotations.Table;
import com.onyshkevych.model.anotations.CompositePrimaryKey;

@Table(name = "it_company_vacancy_has_contact_person")
public class ITCompanyVacancyHasContactPerson {
    @CompositePrimaryKey
    private PK_ITCompanyVacancyHasContactPerson pk;
    public ITCompanyVacancyHasContactPerson() {

    }
    public ITCompanyVacancyHasContactPerson(PK_ITCompanyVacancyHasContactPerson pk) {
        this.pk = pk;
    }

    public PK_ITCompanyVacancyHasContactPerson getPk() {
        return pk;
    }

    public void setPk(PK_ITCompanyVacancyHasContactPerson pk) {
        this.pk = pk;
    }

    @Override
    public String toString() {
        return "ITCompanyVacancyHasContactPerson{" +
                "pk=" + pk +
                '}';
    }
}
