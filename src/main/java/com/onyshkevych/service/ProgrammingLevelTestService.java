package com.onyshkevych.service;
import com.onyshkevych.model.objects.ProgrammingLevelTest;
import com.onyshkevych.DAO.ProgrammingLevelTestDAOImp;
public class ProgrammingLevelTestService extends GeneralService<ProgrammingLevelTest, Integer, ProgrammingLevelTestDAOImp>{
    public  ProgrammingLevelTestService(){
        super(ProgrammingLevelTestDAOImp.class);
    }
}
