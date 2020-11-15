package com.onyshkevych.model.objects;
import com.onyshkevych.model.anotations.Column;
public class PK_ITCompanyVacancyHasContactPerson {
    @Column(name = "it_company_vacancy_id")
    private int itCompanyVacancyId;

    @Column(name = "candidate_info_id")
    private int contact_person_id;
    public PK_ITCompanyVacancyHasContactPerson() {

    }
    public PK_ITCompanyVacancyHasContactPerson(int itCompanyVacancyId, int contact_person_id) {
        this.itCompanyVacancyId = itCompanyVacancyId;
        this.contact_person_id = contact_person_id;
    }

    public int getItCompanyVacancyId() {
        return itCompanyVacancyId;
    }

    public void setItCompanyVacancyId(int itCompanyVacancyId) {
        this.itCompanyVacancyId = itCompanyVacancyId;
    }

    public int getCandidateInfoId() {
        return contact_person_id;
    }

    public void setCandidateInfoId(int contact_person_id) {
        this.contact_person_id = contact_person_id;
    }

    @Override
    public String toString() {
        return "PK_ITCompanyVacancyHasCandidateInfo{" +
                "itCompanyVacancyId=" + itCompanyVacancyId +
                ", contact_person_id=" + contact_person_id +
                '}';
    }
}