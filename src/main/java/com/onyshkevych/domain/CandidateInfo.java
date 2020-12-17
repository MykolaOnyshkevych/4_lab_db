package com.onyshkevych.domain;

import javax.persistence.*;

@Entity(name = "CandidateInfo")
@Table(name = "candidate_info", schema = "lab5db", catalog = "")
public class CandidateInfo implements GeneralEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @ManyToOne
    @JoinColumn(name = "interview_id", referencedColumnName = "id", nullable = false)
    private InterviewResults interviewResultsByInterviewId;

    @ManyToOne
    @JoinColumn(name = "it_company_vacancy_id", referencedColumnName = "id", nullable = false)
    private ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId;


    public CandidateInfo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public InterviewResults getInterviewResultsByInterviewId() {
        return interviewResultsByInterviewId;
    }

    public void setInterviewResultsByInterviewId(InterviewResults interviewResultsByInterviewId) {
        this.interviewResultsByInterviewId = interviewResultsByInterviewId;
    }

    public ItCompanyVacancy getItCompanyVacancyByItCompanyVacancyId() {
        return itCompanyVacancyByItCompanyVacancyId;
    }

    public void setItCompanyVacancyByItCompanyVacancyId(ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId) {
        this.itCompanyVacancyByItCompanyVacancyId = itCompanyVacancyByItCompanyVacancyId;
    }

    public CandidateInfo(String firstName, String secondName,
                         InterviewResults interviewResultsByInterviewId,
                         ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.interviewResultsByInterviewId = interviewResultsByInterviewId;
        this.itCompanyVacancyByItCompanyVacancyId = itCompanyVacancyByItCompanyVacancyId;
    }

    public CandidateInfo(Integer id, String firstName, String secondName,
                         InterviewResults interviewResultsByInterviewId,
                         ItCompanyVacancy itCompanyVacancyByItCompanyVacancyId) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.interviewResultsByInterviewId = interviewResultsByInterviewId;
        this.itCompanyVacancyByItCompanyVacancyId = itCompanyVacancyByItCompanyVacancyId;
    }

    @Override
    public String toString() {
        return "CandidateInfoEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", interviewResultsByInterviewId=" + interviewResultsByInterviewId +
                ", itCompanyVacancyByItCompanyVacancyId=" + itCompanyVacancyByItCompanyVacancyId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandidateInfo that = (CandidateInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        return result;
    }


}
