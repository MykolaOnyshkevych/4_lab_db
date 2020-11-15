package com.onyshkevych.service;
import com.onyshkevych.DAO.EnglishLevelTestDAOImp;
import com.onyshkevych.model.objects.EnglishLevelTest;
public class EnglishLevelTestService extends GeneralService<EnglishLevelTest, Integer, EnglishLevelTestDAOImp>{
    public EnglishLevelTestService(){
        super(EnglishLevelTestDAOImp.class);
    }


}
