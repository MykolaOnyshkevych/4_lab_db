package com.onyshkevych.controller;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import com.onyshkevych.service.CandidateInfoService;
import com.onyshkevych.models.CandidateInfo;
public class CandidateInfoController extends GeneralController<CandidateInfo, Integer, CandidateInfoService>{
    public CandidateInfoController(){
        super(CandidateInfoService.class);
    }
    public List<CandidateInfo> findByInitials(String firstName, String secondName) throws SQLException {
        Configuration configuration = new Configuration();
        configuration.configure();
        Session session = configuration.buildSessionFactory().openSession();
        CandidateInfoService service = new CandidateInfoService();
        List<CandidateInfo> candidates = null;
        try {
            candidates = service.findByInitials(firstName, secondName, session);
        } finally {
            session.close();
        }
        return candidates;
    }

}
