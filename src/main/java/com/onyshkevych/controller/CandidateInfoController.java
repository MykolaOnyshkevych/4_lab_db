package com.onyshkevych.controller;

import com.onyshkevych.domain.CandidateInfo;
import com.onyshkevych.service.CandidateInfoService;
import com.onyshkevych.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/candidate")
public class CandidateInfoController extends GeneralController<CandidateInfo> {

    @Autowired
    CandidateInfoService candidateInfoService;

    @Override
    public ServiceInterface<CandidateInfo> getService() {
        return candidateInfoService;
    }

}