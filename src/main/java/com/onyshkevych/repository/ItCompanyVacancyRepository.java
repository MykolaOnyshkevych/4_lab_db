package com.onyshkevych.repository;

import com.onyshkevych.domain.ItCompanyVacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItCompanyVacancyRepository extends JpaRepository<ItCompanyVacancy, Integer> {

}