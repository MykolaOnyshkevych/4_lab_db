package com.onyshkevych.controller;

import com.onyshkevych.models.ItCompanyVacancy;
import com.onyshkevych.service.ItCompanyVacancyService;

public class ItCompanyVacancyController extends GeneralController<ItCompanyVacancy, Integer, ItCompanyVacancyService> {
    public  ItCompanyVacancyController(){

        super(ItCompanyVacancyService.class);
    }

}