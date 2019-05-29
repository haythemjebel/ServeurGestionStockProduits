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
import com.haythem.service.IcrudService;

@RestController
@RequestMapping("/Api/Produit")
@CrossOrigin
public class ProduitContoller {
	@Autowired
	private IcrudService<Produit, Long> ProduitService ;
	
	@GetMapping
	public List<Produit>getProduits(){
		return ProduitService.getAll();
	}
	@PostMapping
	public void addProduits(@RequestBody Produit produit) {
		ProduitService.add(produit);
	}
	@PutMapping
	public void updateProduits(@RequestBody Produit produit) {
		ProduitService.update(produit);
	}
	@DeleteMapping("/{id}")
	public void deleteProduits(@PathVariable Long id) {
		ProduitService.delete(id);
	}


}
