package com.onyshkevych.service;
import com.onyshkevych.model.objects.ITCompanyVacancy;
import com.onyshkevych.DAO.ITCompanyVacancyDAOImp;
import java.sql.SQLException;
import java.util.List;
public class ITCompanyVacancyService extends GeneralService<ITCompanyVacancy, Integer,ITCompanyVacancyDAOImp> {
    public  ITCompanyVacancyService(){
        super(ITCompanyVacancyDAOImp.class);
    }

}
