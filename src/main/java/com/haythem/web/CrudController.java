package com.haythem.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.haythem.service.IcrudService;

public class CrudController<T, ID> {
	@Autowired
	private IcrudService<T, ID> service ;
	
	@GetMapping
	public List<T>getALL(){
		return service.getAll();
	}
	@PostMapping
	public void add(@RequestBody T entity) {
		service.add(entity);
	}
	@PutMapping
	public void update(@RequestBody T entity) {
		service.update(entity);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable ID id) {
		service.delete(id);
	}


}
