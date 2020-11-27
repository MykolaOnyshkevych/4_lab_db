package com.onyshkevych.service;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import com.onyshkevych.DAO.CandidateInfoDAOImp;
import com.onyshkevych.models.CandidateInfo;

public class CandidateInfoService extends GeneralServiceImp<CandidateInfo,Integer, CandidateInfoDAOImp>{
    public CandidateInfoService() {
        super(CandidateInfoDAOImp.class);
    }
    public List<CandidateInfo> findByInitials(String firstName, String secondName, Session session)
            throws SQLException {
        return new CandidateInfoDAOImp().findByInitials(firstName, secondName, session);
    }
}