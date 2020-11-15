package com.onyshkevych.controller;
import com.onyshkevych.model.objects.ProgrammingLevelTest;
import com.onyshkevych.service.ProgrammingLevelTestService;
public class ProgrammingLevelTestController extends  GeneralController<ProgrammingLevelTest, Integer, ProgrammingLevelTestService>{
    public  ProgrammingLevelTestController(){
        super(ProgrammingLevelTestService.class);
    }
}
