package com.onyshkevych.DAO;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import com.onyshkevych.models.CandidateInfo;
import org.hibernate.query.Query;

public class CandidateInfoDAOImp extends GeneralDAOImp<CandidateInfo,Integer> {
    public CandidateInfoDAOImp(){
        super(CandidateInfo.class);
    }
    public List<CandidateInfo> findByInitials(String firstName, String secondName, Session session)
            throws SQLException {
        List<CandidateInfo> people = new LinkedList<>();
        Query query =  session.createQuery("FROM CandidateInfo WHERE firstName = :nameValue AND secondName = :surnameValue");
        query.setParameter("nameValue", firstName).setParameter("surnameValue", secondName);
        for (Object person : query.getResultList()) {
            people.add((CandidateInfo) person);
        }
        return people;
    }
}
