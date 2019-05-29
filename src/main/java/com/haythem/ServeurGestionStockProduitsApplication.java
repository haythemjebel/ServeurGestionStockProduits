package com.haythem;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.haythem.DAO.ProduitRepository;
import com.haythem.DAO.RoleRepository;
import com.haythem.DAO.UserRepository;
import com.haythem.entities.Produit;
import com.haythem.entities.Role;
import com.haythem.entities.User;
import com.haythem.util.RoleEnum;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication implements CommandLineRunner{
	@Autowired
	private ProduitRepository prodRepository;
	@Autowired
	private RoleRepository roleRep ;
	@Autowired
	private UserRepository userRep ;
	public static void main(String[] args) {
		SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		prodRepository.save(new Produit("livre",50,20))	;	
//		prodRepository.save(new Produit("cahier",200,5.25f));	
//		prodRepository.save(new Produit("stylo",500,2.10f));	
		
		Role roleuser=new Role(RoleEnum.ROLE_USER);
		Role roleadmin=new Role(RoleEnum.ROLE_ADMIN);
//		roleRep.save(roleuser);
//		roleRep.save(roleadmin);
//		User user= new User("user", "puser", true);
//		user.setRoles(Arrays.asList(roleuser));
//		userRep.save(user);
//		
//		User admin= new User("admin", "admin", true);
//		admin.setRoles(Arrays.asList(roleuser,roleadmin));
//		userRep.save(admin);
	}

}
