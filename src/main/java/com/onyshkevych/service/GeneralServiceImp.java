package com.onyshkevych.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import com.onyshkevych.DAO.GeneralDAO;

public abstract class GeneralServiceImp<T, ID, DAO> implements GeneralService<T, ID> {

    private GeneralDAO<T, ID> dataaccess;

    @SuppressWarnings({ "unchecked", "deprecation" })
    public GeneralServiceImp(Class<DAO> currentClass) {
        try {
            dataaccess = (GeneralDAO<T, ID>) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> findAll(Session session) throws SQLException {
        return dataaccess.findAll(session);
    }

    @Override
    public T find(ID id, Session session) throws SQLException {
        return dataaccess.find(id, session);
    }

    @Override
    public void delete(ID id, Session session) throws SQLException {
        dataaccess.delete(id, session);
    }

    @Override
    public void update(T entity, Session session) throws SQLException {
        dataaccess.update(entity, session);
    }

    @Override
    public void create(T entity, Session session) throws SQLException {
        dataaccess.create(entity, session);
    }

}