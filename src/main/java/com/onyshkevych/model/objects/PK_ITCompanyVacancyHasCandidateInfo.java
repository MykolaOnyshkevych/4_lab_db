package com.onyshkevych.model.objects;
import com.onyshkevych.model.anotations.Column;
public class PK_ITCompanyVacancyHasCandidateInfo {
    @Column(name = "it_company_vacancy_id")
    private int itCompanyVacancyId;

    @Column(name = "candidate_info_id")
    private int candidateInfoId;
    public PK_ITCompanyVacancyHasCandidateInfo() {

    }
    public PK_ITCompanyVacancyHasCandidateInfo(int itCompanyVacancyId, int candidateInfoId) {
        this.itCompanyVacancyId = itCompanyVacancyId;
        this.candidateInfoId = candidateInfoId;
    }

    public int getItCompanyVacancyId() {
        return itCompanyVacancyId;
    }

    public void setItCompanyVacancyId(int itCompanyVacancyId) {
        this.itCompanyVacancyId = itCompanyVacancyId;
    }

    public int getCandidateInfoId() {
        return candidateInfoId;
    }

    public void setCandidateInfoId(int candidateInfoId) {
        this.candidateInfoId = candidateInfoId;
    }

    @Override
    public String toString() {
        return "PK_ITCompanyVacancyHasCandidateInfo{" +
                "itCompanyVacancyId=" + itCompanyVacancyId +
                ", candidateInfoId=" + candidateInfoId +
                '}';
    }
}
