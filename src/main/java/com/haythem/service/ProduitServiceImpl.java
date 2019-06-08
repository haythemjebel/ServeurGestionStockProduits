package com.haythem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haythem.entities.Produit;

@Service
public class ProduitServiceImpl implements IcrudService<Produit, Long> {

	private List<Produit> produits;

	public ProduitServiceImpl() {
		produits = new ArrayList<Produit>();
		produits.add(new Produit("livre", 50, 20));
		produits.add(new Produit("cahier", 200, 5.25f));
		produits.add(new Produit("stylo", 500, 2.10f));
	}

	@Override
	public List<Produit> getAll() {
		return produits;
	}

	@Override
	public void add(Produit produit) {
		produits.add(produit);

	}

	@Override
	public void update(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void delete(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		produits.remove(produit);
	}

	@Override
	public void saveAll(Iterable<Produit> iterable) {
		Iterator<Produit> iterator = iterable.iterator();
		if (iterator.hasNext()) {
			produits.add(iterator.next());
		}
	}

}
