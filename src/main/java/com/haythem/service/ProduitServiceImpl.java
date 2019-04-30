package com.haythem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haythem.entities.Produit;
@Service
public class ProduitServiceImpl implements IProduitService{

	private List<Produit>produits;
	
	
	public ProduitServiceImpl() {
		produits=new ArrayList<Produit>();
		produits.add(new Produit("livre",50,20));
		produits.add(new Produit("cahier",200,5.25f));
		produits.add(new Produit("stylo",500,2.10f));
	}

	@Override
	public List<Produit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit= new Produit();
		produit.setId(id);
		produits.remove(produit);
	}

}