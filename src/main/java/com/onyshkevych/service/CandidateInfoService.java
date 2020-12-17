package com.onyshkevych.service;

import com.onyshkevych.domain.CandidateInfo;
import com.onyshkevych.repository.CandidateInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidateInfoService extends GeneralService<CandidateInfo> {

    @Autowired
    CandidateInfoRepository candidateInfoRepository;

    @Override
    public JpaRepository<CandidateInfo, Integer> getRepository() {
        return candidateInfoRepository;
    }

}