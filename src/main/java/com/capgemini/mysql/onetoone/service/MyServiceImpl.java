package com.capgemini.mysql.onetoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.mysql.onetoone.dao.PersonDao;
import com.capgemini.mysql.onetoone.entity.Person;

@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private PersonDao dao;
	
	@Override
	public void add(Person person) {
		dao.save(person);
	}

	@Override
	public Person getAll(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}
	
	@Override
	public List getEver() {
		return dao.findAll();
	}
}
