package com.onyshkevych.model.objects;

import com.onyshkevych.model.anotations.Column;
import com.onyshkevych.model.anotations.PrimaryKey;
import com.onyshkevych.model.anotations.Table;

@Table(name = "english_level_test")
public class EnglishLevelTest {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @Column(name = "test_mark_english")
    private Integer testMarkEnglish;
    @Column(name = "expert_comment")
    private String expertsComment;

    public EnglishLevelTest() {
    }
    public EnglishLevelTest( Integer testMarkEnglish, String expertsComment) {
        this(-1,testMarkEnglish,expertsComment);
    }
    public EnglishLevelTest(Integer id, Integer testMarkEnglish, String expertsComment) {
        this.id = id;
        this.testMarkEnglish = testMarkEnglish;
        this.expertsComment = expertsComment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestMarkEnglish() {
        return testMarkEnglish;
    }

    public void setTestMarkEnglish(Integer testMarkEnglish) {
        this.testMarkEnglish = testMarkEnglish;
    }

    public String getExpertsComment() {
        return expertsComment;
    }

    public void setExpertsComment(String expertsComment) {
        this.expertsComment = expertsComment;
    }

    @Override
    public String toString() {
        return "EnglishLevelTest{" +
                "id=" + id +
                ",\n testMarkEnglish=" + testMarkEnglish +
                ",\n expertsComment='" + expertsComment + '\'' +
                '}';
    }
}