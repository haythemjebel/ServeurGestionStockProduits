package com.haythem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.haythem.DAO.ProduitRepository;
import com.haythem.entities.Produit;
@Service
@Primary
public class ProduitService implements IcrudService<Produit,Long> {
	@Autowired
	private ProduitRepository prodRepository;
	@Override
	public List<Produit> getAll() {
		return prodRepository.findAll();
	}

	@Override
	public void add(Produit produit) {
		prodRepository.save(produit);
	}

	@Override
	public void update(Produit produit) {
		prodRepository.save(produit);
	}

	@Override
	public void delete(Long id) {
		Produit p = new Produit();
		p.setId(id);
		prodRepository.delete(p);
	}

	@Override
	public void saveAll(Iterable<Produit>iterable) {
		prodRepository.saveAll(iterable);
	}

}
