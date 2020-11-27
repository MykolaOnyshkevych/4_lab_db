package com.onyshkevych.service;

import com.onyshkevych.DAO.InterviewResultsDAOImp;
import com.onyshkevych.models.InterviewResults;


public class InterviewResultsService extends GeneralServiceImp<InterviewResults,Integer, InterviewResultsDAOImp>{
    public InterviewResultsService() {
        super(InterviewResultsDAOImp.class);
    }
}