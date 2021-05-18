package com.onyshkevych.service;

import com.onyshkevych.domain.ItCompanyVacancy;
import com.onyshkevych.repository.ItCompanyVacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class ItCompanyVacancyService extends GeneralService<ItCompanyVacancy> {

    @Autowired
    ItCompanyVacancyRepository itCompanyVacancyRepository;

    @Override
    public JpaRepository<ItCompanyVacancy, Integer> getRepository() {
        return itCompanyVacancyRepository;
    }

}