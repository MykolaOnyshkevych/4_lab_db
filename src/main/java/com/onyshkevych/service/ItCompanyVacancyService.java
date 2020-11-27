package com.onyshkevych.service;

import com.onyshkevych.DAO.ItCompanyVacancyDAOImp;
import com.onyshkevych.models.ItCompanyVacancy;


public class ItCompanyVacancyService extends GeneralServiceImp<ItCompanyVacancy,Integer, ItCompanyVacancyDAOImp>{
    public ItCompanyVacancyService() {
        super(ItCompanyVacancyDAOImp.class);
    }
}