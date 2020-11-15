package com.onyshkevych.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.onyshkevych.persistant.ConnectionManager;
import com.onyshkevych.transformer.Transformer;
import com.onyshkevych.model.objects.ITCompanyVacancy;
public class ITCompanyVacancyDAOImp extends GeneralDAOImp<ITCompanyVacancy, Integer>{

    public  ITCompanyVacancyDAOImp(){
        super(ITCompanyVacancy.class);
    }

}
