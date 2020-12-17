package com.onyshkevych.controller;

import java.sql.SQLException;
import java.util.List;

import com.onyshkevych.controller.Controller;
import com.onyshkevych.domain.GeneralEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.onyshkevych.service.ServiceInterface;

public abstract class GeneralController<T extends GeneralEntity> implements Controller<T> {


    public abstract ServiceInterface<T> getService();

    @Override
    @GetMapping("")
    public ResponseEntity<List<T>> findAll() throws SQLException {
        List<T> entityList = getService().findAll();
        if (entityList == null){
            return new ResponseEntity("404", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(entityList, HttpStatus.OK);
        }
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable Integer id) throws SQLException {
        T entity = getService().find(id);
        if (entity == null) {
            return new ResponseEntity("404", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(entity, HttpStatus.OK);
        }
    }

    @Override
    @PostMapping("")
    public ResponseEntity<T> create(@RequestBody T entity) throws SQLException {
        T createdEntity = getService().create(entity);
        if (createdEntity == null) {
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(createdEntity, HttpStatus.CREATED);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable Integer id, @RequestBody T entity) throws SQLException {
        entity.setId(id);
        T updatedEntity = getService().update(entity);
        if (updatedEntity == null) {
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<T> delete(@PathVariable Integer id) throws SQLException {
        T deletedEntity = getService().delete(id);
        if (deletedEntity == null) {
            return new ResponseEntity("404", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(deletedEntity, HttpStatus.OK);
    }
}