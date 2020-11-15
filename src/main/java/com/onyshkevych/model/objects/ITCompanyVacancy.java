package com.onyshkevych.model.objects;

import com.onyshkevych.model.anotations.Column;
import com.onyshkevych.model.anotations.PrimaryKey;
import com.onyshkevych.model.anotations.Table;

@Table(name = "it_company_vacancy")
public class ITCompanyVacancy {
    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @Column(name = "vacancy_description")
    private String vacancyDescription;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "vacancy_salary_in_gryvnas")
    private Integer vacancySalaryInUAH;

    public ITCompanyVacancy() {

    }

    public ITCompanyVacancy(Integer id, String vacancyDescription, String projectName, Integer vacancySalaryInUAH) {
        this.id = id;
        this.vacancyDescription = vacancyDescription;
        this.projectName = projectName;
        this.vacancySalaryInUAH = vacancySalaryInUAH;
    }
    public ITCompanyVacancy( String vacancyDescription, String projectName, Integer vacancySalaryInUAH) {
        this(-1,vacancyDescription, projectName,  vacancySalaryInUAH);
    }

    @Override
    public String toString() {
        return "ITCompanyVacancy{" +
                "id=" + id +
                ", vacancyDescription='" + vacancyDescription + '\'' +
                ", projectName='" + projectName + '\'' +
                ", vacancySalaryInUAH=" + vacancySalaryInUAH +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVacancyDescription() {
        return vacancyDescription;
    }

    public void setVacancyDescription(String vacancyDescription) {
        this.vacancyDescription = vacancyDescription;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getVacancySalaryInUAH() {
        return vacancySalaryInUAH;
    }

    public void setVacancySalaryInUAH(Integer vacancySalaryInUAH) {
        this.vacancySalaryInUAH = vacancySalaryInUAH;
    }
}
