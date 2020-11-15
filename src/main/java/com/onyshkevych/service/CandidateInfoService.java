package com.onyshkevych.service;

import com.onyshkevych.DAO.CandidateInfoDAOImp;
import com.onyshkevych.model.objects.CandidateInfo;

public class CandidateInfoService extends GeneralService<CandidateInfo,Integer, CandidateInfoDAOImp>{
    public CandidateInfoService() {
        super(CandidateInfoDAOImp.class);
    }
}