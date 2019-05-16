package com.capgemini.mysql.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.mysql.onetoone.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
