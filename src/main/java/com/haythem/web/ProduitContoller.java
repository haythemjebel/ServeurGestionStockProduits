package com.haythem.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haythem.entities.Produit;
import com.haythem.service.IProduitService;

@RestController
@RequestMapping("/Api/Produit")
@CrossOrigin
public class ProduitContoller {
	@Autowired
	private IProduitService ProduitService ;
	
	@GetMapping
	public List<Produit>getProduits(){
		return ProduitService.getProduits();
	}
	@PostMapping
	public void addProduits(@RequestBody Produit produit) {
		ProduitService.addProduit(produit);
	}
	@PutMapping
	public void updateProduits(@RequestBody Produit produit) {
		ProduitService.updateProduit(produit);
	}
	@DeleteMapping("/{id}")
	public void deleteProduits(@PathVariable Long id) {
		ProduitService.deleteProduit(id);
	}


}
