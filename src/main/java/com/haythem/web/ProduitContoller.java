package com.haythem.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haythem.entities.Produit;

@RestController
@RequestMapping("/Api/Produit")
@CrossOrigin
public class ProduitContoller extends CrudController<Produit, Long> {

}
