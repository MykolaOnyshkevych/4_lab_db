package com.onyshkevych.domain;

import javax.persistence.*;

@Entity(name = "InterviewResults")
@Table(name = "interview_results", schema = "lab5db", catalog = "")
public class InterviewResults implements GeneralEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "programming_mark")
    private Integer programmingMark;

    @Column(name = "english_mark")
    private Integer englishMark;

    @Column(name = "experts_mark")
    private String expertsMark;

    public String getExpertsMark() {
        return expertsMark;
    }

    public Integer getEnglishMark() {
        return englishMark;
    }

    public void setExpertsMark(String expertsMark) {
        this.expertsMark = expertsMark;
    }

    public Integer getProgrammingMark() {
        return programmingMark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProgrammingMark(Integer programmingMark) {
        this.programmingMark = programmingMark;
    }


    public void setEnglishMark(Integer englishMark) {
        this.englishMark = englishMark;
    }


    public InterviewResults() {

    }

    public InterviewResults(String expertsMark, Integer programmingMark, Integer englishMark) {
        this.expertsMark = expertsMark;
        this.programmingMark = programmingMark;
        this.englishMark = englishMark;
    }

    public InterviewResults(Integer id, String expertsMark, Integer programmingMark, Integer englishMark) {
        this.id = id;
        this.expertsMark = expertsMark;
        this.programmingMark = programmingMark;
        this.englishMark = englishMark;
    }

    @Override
    public String toString() {
        return "InterviewResultsEntity{" +
                "id=" + id +
                ", expertsMark='" + expertsMark + '\'' +
                ", programmingMark=" + programmingMark +
                ", englishMark=" + englishMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterviewResults that = (InterviewResults) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (expertsMark != null ? !expertsMark.equals(that.expertsMark) : that.expertsMark != null) return false;
        if (programmingMark != null ? !programmingMark.equals(that.programmingMark) : that.programmingMark != null)
            return false;
        if (englishMark != null ? !englishMark.equals(that.englishMark) : that.englishMark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (expertsMark != null ? expertsMark.hashCode() : 0);
        result = 31 * result + (programmingMark != null ? programmingMark.hashCode() : 0);
        result = 31 * result + (englishMark != null ? englishMark.hashCode() : 0);
        return result;
    }
}