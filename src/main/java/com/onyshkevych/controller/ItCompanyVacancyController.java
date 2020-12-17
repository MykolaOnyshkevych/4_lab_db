package com.onyshkevych.controller;

import com.onyshkevych.domain.ItCompanyVacancy;
import com.onyshkevych.service.ItCompanyVacancyService;
import com.onyshkevych.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vacancy")
public class ItCompanyVacancyController extends GeneralController<ItCompanyVacancy> {

    @Autowired
    ItCompanyVacancyService itCompanyVacancyService;

    @Override
    public ServiceInterface<ItCompanyVacancy> getService() {
        return itCompanyVacancyService;
    }

}