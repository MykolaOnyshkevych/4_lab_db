package com.onyshkevych.service;

import com.onyshkevych.model.objects.InterviewResaults;
import com.onyshkevych.DAO.InterviewResaultsDAOImp;
public class InterviewResaultsService extends GeneralService<InterviewResaults, Integer,InterviewResaultsDAOImp >{
    public InterviewResaultsService(){
        super(InterviewResaultsDAOImp.class);
    }
}
