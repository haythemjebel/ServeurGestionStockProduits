package com.haythem.service;

import java.util.List;

import com.haythem.entities.Produit;

public interface IProduitService {
	List<Produit>getProduits();
	void addProduit(Produit produit);
	void updateProduit(Produit produit);
	void deleteProduit(Long id);

}
