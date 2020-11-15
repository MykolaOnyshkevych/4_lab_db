package com.onyshkevych.model.objects;


import com.onyshkevych.model.anotations.Column;
import com.onyshkevych.model.anotations.PrimaryKey;
import com.onyshkevych.model.anotations.Table;

@Table(name = "interview_resaults")
public class InterviewResaults {
    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @Column(name = "experts_mark")
    private String expertsMark;
    @Column(name = "english_id")
    private Integer englishId;
    @Column(name = "technic_id")
    private Integer technicId;
    @Column(name = "programing_id")
    private Integer programingId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpertsMark() {
        return expertsMark;
    }

    public void setExpertsMark(String expertsMark) {
        this.expertsMark = expertsMark;
    }

    public Integer getEnglishId() {
        return englishId;
    }

    public void setEnglishId(Integer englishId) {
        this.englishId = englishId;
    }

    public Integer getTechnicId() {
        return technicId;
    }

    public void setTechnicId(Integer technicId) {
        this.technicId = technicId;
    }

    public Integer getProgramingId() {
        return programingId;
    }

    public void setProgramingId(Integer programingId) {
        this.programingId = programingId;
    }

    public InterviewResaults() {

    }

    public InterviewResaults(Integer id, String expertsMark, Integer englishId, Integer technicId, Integer programingId) {
        this.id = id;
        this.expertsMark = expertsMark;
        this.englishId = englishId;
        this.technicId = technicId;
        this.programingId = programingId;
    }

    public InterviewResaults(String expertsMark, Integer englishId, Integer technicId, Integer programingId) {
        this(-1,expertsMark, englishId, technicId, programingId);
    }

    @Override
    public String toString() {
        return "InterviewResaults{" +
                "id=" + id +
                ", expertsMark=" + expertsMark +
                ", englishId=" + englishId +
                ", technicId=" + technicId +
                ", programingId=" + programingId +
                '}';
    }
}