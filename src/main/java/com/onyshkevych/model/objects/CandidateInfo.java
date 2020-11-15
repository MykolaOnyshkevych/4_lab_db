package com.onyshkevych.model.objects;

import com.onyshkevych.model.anotations.Column;
import com.onyshkevych.model.anotations.PrimaryKey;
import com.onyshkevych.model.anotations.Table;

@Table(name = "candidate_info")
public class CandidateInfo {
    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @Column(name = "candidate_name")
    private String candidateName;

    @Column(name = "candidate_second_name")
    private String candidateSecondName;
    @Column(name = "work_experience_in_years")
    private Integer workExperienceInYears;
    @Column(name = "age")
    private Integer age;
    @Column(name = "interview_id")
    private Integer interviewId;
    public Integer getId() {
        return id;
    }
    public CandidateInfo() {

    }
    public CandidateInfo(Integer id, String candidateName, String candidateSecondName, Integer workExperienceInYears, Integer age, Integer interviewId) {
        this.id = id;
        this.candidateName = candidateName;
        this.candidateSecondName = candidateSecondName;
        this.workExperienceInYears = workExperienceInYears;
        this.age = age;
        this.interviewId = interviewId;
    }


    public CandidateInfo(String candidateName, String candidateSecondName, Integer workExperienceInYears, Integer age, Integer interviewId) {
        this(-1,candidateName, candidateSecondName, workExperienceInYears,  age,  interviewId);
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateSecondName() {
        return candidateSecondName;
    }

    public void setCandidateSecondName(String candidateSecondName) {
        this.candidateSecondName = candidateSecondName;
    }

    public Integer getWorkExperienceInYears() {
        return workExperienceInYears;
    }

    @Override
    public String toString() {
        return "CandidateInfo{" +
                "id=" + id +
                ", candidateName='" + candidateName + '\'' +
                ", candidateSecondName='" + candidateSecondName + '\'' +
                ", workExperienceInYears=" + workExperienceInYears +
                ", age=" + age +
                ", interviewId=" + interviewId +
                '}';
    }

    public void setWorkExperienceInYears(Integer workExperienceInYears) {
        this.workExperienceInYears = workExperienceInYears;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }




}
