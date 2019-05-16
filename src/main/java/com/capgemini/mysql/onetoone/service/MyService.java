package com.capgemini.mysql.onetoone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.mysql.onetoone.entity.Person;

@Service
public interface MyService {
	public void add(Person person);
	public Person getAll(int id);
	void delete(int id);
	List getEver();
}
