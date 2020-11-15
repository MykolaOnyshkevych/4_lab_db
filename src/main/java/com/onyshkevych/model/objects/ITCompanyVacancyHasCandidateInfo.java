package com.onyshkevych.model.objects;
import com.onyshkevych.model.anotations.Table;
import com.onyshkevych.model.anotations.CompositePrimaryKey;

@Table(name = "exercise_program_has_exercise")
public class ITCompanyVacancyHasCandidateInfo {

    @CompositePrimaryKey
    private PK_ITCompanyVacancyHasCandidateInfo pk;

    public ITCompanyVacancyHasCandidateInfo() {

    }
    public ITCompanyVacancyHasCandidateInfo(PK_ITCompanyVacancyHasCandidateInfo pk) {
        this.pk = pk;
    }

    public PK_ITCompanyVacancyHasCandidateInfo getPk() {
        return pk;
    }

    public void setPk(PK_ITCompanyVacancyHasCandidateInfo pk) {
        this.pk = pk;
    }

    @Override
    public String toString() {
        return "ITCompanyVacancyHasCandidateInfo{" +
                "pk=" + pk +
                '}';
    }

}
