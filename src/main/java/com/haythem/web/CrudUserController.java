package com.haythem.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haythem.entities.User;
import com.haythem.service.IcrudService;

@RestController
@RequestMapping(name="crud_user")
public class CrudUserController {
	@Autowired
	private IcrudService<User, Long> userService ;
	
	@GetMapping
	public List<User>getUser(){
		return userService.getAll();
	}
	@PostMapping
	public void addUser(@RequestBody User produit) {
		userService.add(produit);
	}
	@PutMapping
	public void updateUser(@RequestBody User produit) {
		userService.update(produit);
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.delete(id);
	}


}
