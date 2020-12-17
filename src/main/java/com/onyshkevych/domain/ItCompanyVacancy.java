package com.onyshkevych.domain;

import javax.persistence.*;

@Entity(name = "ItCompanyVacancy")
@Table(name = "it_company_vacancy", schema = "lab5db", catalog = "")
public class ItCompanyVacancy implements GeneralEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "vacancy_description")
    private String vacancyDescription;

    @Column(name = "vacancy_salary_in_gryvnas")
    private Integer vacancySalaryInGryvnas;


    public ItCompanyVacancy() {

    }

    public Integer getVacancySalaryInGryvnas() {
        return vacancySalaryInGryvnas;
    }

    public void setVacancySalaryInGryvnas(Integer vacancySalaryInGryvnas) {
        this.vacancySalaryInGryvnas = vacancySalaryInGryvnas;
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

    public ItCompanyVacancy(String vacancyDescription, Integer vacancySalaryInGryvnas) {
        this.vacancyDescription = vacancyDescription;
        this.vacancySalaryInGryvnas = vacancySalaryInGryvnas;
    }

    public ItCompanyVacancy(Integer id, String vacancyDescription, Integer vacancySalaryInGryvnas) {
        this.id = id;
        this.vacancyDescription = vacancyDescription;
        this.vacancySalaryInGryvnas = vacancySalaryInGryvnas;
    }


    @Override
    public String toString() {
        return "ItCompanyVacancyEntity{" +
                "id=" + id +
                ", vacancyDescription='" + vacancyDescription + '\'' +
                ", vacancySalaryInGryvnas=" + vacancySalaryInGryvnas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItCompanyVacancy that = (ItCompanyVacancy) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (vacancyDescription != null ? !vacancyDescription.equals(that.vacancyDescription) : that.vacancyDescription != null)
            return false;
        if (vacancySalaryInGryvnas != null ? !vacancySalaryInGryvnas.equals(that.vacancySalaryInGryvnas) : that.vacancySalaryInGryvnas != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (vacancyDescription != null ? vacancyDescription.hashCode() : 0);
        result = 31 * result + (vacancySalaryInGryvnas != null ? vacancySalaryInGryvnas.hashCode() : 0);
        return result;
    }
}