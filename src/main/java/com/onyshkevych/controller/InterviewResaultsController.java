package com.onyshkevych.controller;
import com.onyshkevych.model.objects.InterviewResaults;
import com.onyshkevych.service.InterviewResaultsService;
public class InterviewResaultsController extends GeneralController<InterviewResaults, Integer,InterviewResaultsService> {
    public  InterviewResaultsController(){
        super(InterviewResaultsService.class);
    }
}
