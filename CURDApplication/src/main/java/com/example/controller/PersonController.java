package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Person;
import com.exmple.service.PersonService;

@RequestMapping("/persons")
	public class PersonController {

		@Autowired
		PersonService ps;

		@RequestMapping("/all")
		public ArrayList<Person> getAll() {
			return ps.getAll();
		}

		@RequestMapping("{id}")
		public Person getPerson(@PathVariable("id") String id) {
			return ps.getPerson(id);
		}
	}

