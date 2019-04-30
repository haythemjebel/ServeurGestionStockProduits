package com.haythem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.haythem.DAO.ProduitRepository;
import com.haythem.entities.Produit;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication implements CommandLineRunner{
	@Autowired
	private ProduitRepository prodRepository;
	public static void main(String[] args) {
		SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		prodRepository.save(new Produit("livre",50,20))	;	
//		prodRepository.save(new Produit("cahier",200,5.25f));	
//		prodRepository.save(new Produit("stylo",500,2.10f));	
	}

}
