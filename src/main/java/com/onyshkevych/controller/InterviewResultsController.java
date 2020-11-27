package com.onyshkevych.controller;

import com.onyshkevych.models.InterviewResults;
import com.onyshkevych.service.InterviewResultsService;
public class InterviewResultsController extends GeneralController<InterviewResults, Integer,InterviewResultsService> {
    public  InterviewResultsController(){
        super(InterviewResultsService.class);
    }
}