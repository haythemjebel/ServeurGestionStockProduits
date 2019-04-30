package com.haythem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.haythem.DAO.ProduitRepository;
import com.haythem.entities.Produit;
@Service
@Primary
public class ProduitService implements IProduitService {
	@Autowired
	private ProduitRepository prodRepository;
	@Override
	public List<Produit> getProduits() {
		return prodRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		prodRepository.save(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		prodRepository.save(produit);
	}

	@Override
	public void deleteProduit(Long id) {
		Produit p = new Produit();
		p.setId(id);
		prodRepository.delete(p);
	}

}
