package com.haythem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.haythem.DAO.UserRepository;
import com.haythem.entities.User;
@Service
@Primary
public class UserService implements IcrudService<User,Long> {
	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void add(User produit) {
		userRepository.save(produit);
	}

	@Override
	public void update(User produit) {
		userRepository.save(produit);
	}

	@Override
	public void delete(Long id) {
		User u = new User();
		u.setId(id);
		userRepository.delete(u);
	}

	@Override
	public void saveAll(Iterable<User> iterable) {
		userRepository.saveAll(iterable);
	}

}
