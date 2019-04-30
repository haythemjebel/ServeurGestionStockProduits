package com.haythem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haythem.entities.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
