package com.educandoweb.course.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CRUDService<E extends Serializable, ID> {

	JpaRepository<E, ID> getRepository();
	
	default List<E> findAll() {
		return getRepository().findAll();
	}
	
	default E findById(ID id) {
		Optional<E> result = getRepository().findById(id);
		return result.get();
	}
}
