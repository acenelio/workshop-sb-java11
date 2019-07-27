package com.educandoweb.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService implements CRUDService<Category, Long> {

	@Autowired
	private CategoryRepository repository;
	
	@Override
	public JpaRepository<Category, Long> getRepository() {
		return repository;
	}
}
