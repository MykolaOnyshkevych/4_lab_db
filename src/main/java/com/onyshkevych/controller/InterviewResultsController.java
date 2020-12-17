package com.onyshkevych.controller;


import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import com.onyshkevych.domain.InterviewResults;
        import com.onyshkevych.service.InterviewResultsService;
        import com.onyshkevych.service.ServiceInterface;

@RestController
@RequestMapping("/interview")
public class InterviewResultsController extends GeneralController<InterviewResults> {

    @Autowired
    InterviewResultsService interviewResultsService;

    @Override
    public ServiceInterface<InterviewResults> getService() {
        return interviewResultsService;
    }

}