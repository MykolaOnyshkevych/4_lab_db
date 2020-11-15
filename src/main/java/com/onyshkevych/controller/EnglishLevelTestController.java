package com.onyshkevych.controller;
import com.onyshkevych.service.EnglishLevelTestService;
import com.onyshkevych.model.objects.EnglishLevelTest;
public class EnglishLevelTestController extends GeneralController<EnglishLevelTest, Integer, EnglishLevelTestService>{
    public EnglishLevelTestController(){
        super(EnglishLevelTestService.class);
    }
}
