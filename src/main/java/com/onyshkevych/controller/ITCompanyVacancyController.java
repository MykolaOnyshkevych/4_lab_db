package com.onyshkevych.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.onyshkevych.model.objects.ITCompanyVacancy;
import com.onyshkevych.service.ITCompanyVacancyService;
import com.onyshkevych.persistant.ConnectionManager;
public class ITCompanyVacancyController extends GeneralController<ITCompanyVacancy, Integer, ITCompanyVacancyService> {
    public  ITCompanyVacancyController(){
        super(ITCompanyVacancyService.class);
    }

}
