package com.onyshkevych.service;
import com.onyshkevych.domain.InterviewResults;
import com.onyshkevych.repository.InterviewResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class InterviewResultsService extends GeneralService<InterviewResults> {

    @Autowired
    InterviewResultsRepository interviewResultsRepository;

    @Override
    public JpaRepository<InterviewResults, Integer> getRepository() {
        return interviewResultsRepository;
    }

}