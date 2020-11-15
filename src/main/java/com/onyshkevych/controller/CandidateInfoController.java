package com.onyshkevych.controller;

import com.onyshkevych.model.objects.CandidateInfo;
import com.onyshkevych.service.CandidateInfoService;

public class CandidateInfoController extends GeneralController<CandidateInfo, Integer, CandidateInfoService>{
    public CandidateInfoController(){
        super(CandidateInfoService.class);
    }
}