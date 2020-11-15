package com.onyshkevych.model.objects;

import com.onyshkevych.model.anotations.Column;
import com.onyshkevych.model.anotations.PrimaryKey;
import com.onyshkevych.model.anotations.Table;

@Table(name = "programming_level_test")
public class ProgrammingLevelTest {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @Column(name = "programming_level")
    private String programmingLevel;
    @Column(name = "test_mark_programming")
    private Integer testMarkProgramming;
    @Column(name = "expert_comment")
    private String expertsComment;

    public ProgrammingLevelTest() {

    }

    public ProgrammingLevelTest(Integer id, String programmingLevel, Integer testMarkProgramming, String expertsComment) {
        this.id = id;
        this.programmingLevel = programmingLevel;
        this.testMarkProgramming = testMarkProgramming;
        this.expertsComment = expertsComment;
    }
    public ProgrammingLevelTest( String programmingLevel, Integer testMarkProgramming, String expertsComment) {
        this(-1, programmingLevel, testMarkProgramming, expertsComment);
    }

    @Override
    public String toString() {
        return "ProgrammingLevelTest{" +
                "id=" + id +
                ", programmingLevel='" + programmingLevel + '\'' +
                ", testMarkProgramming=" + testMarkProgramming +
                ", expertsComment='" + expertsComment + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgrammingLevel() {
        return programmingLevel;
    }

    public void setProgrammingLevel(String programmingLevel) {
        this.programmingLevel = programmingLevel;
    }

    public Integer getTestMarkProgramming() {
        return testMarkProgramming;
    }

    public void setTestMarkProgramming(Integer testMarkProgramming) {
        this.testMarkProgramming = testMarkProgramming;
    }

    public String getExpertsComment() {
        return expertsComment;
    }

    public void setExpertsComment(String expertsComment) {
        this.expertsComment = expertsComment;
    }
}