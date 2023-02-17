package com.inetum.firstproject.controller;

import com.inetum.firstproject.Entity.Produit;
import com.inetum.firstproject.Repository.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class produitController {
@Autowired
    ProduitRepo repo;


        @GetMapping("/AllLista")

    public List<Produit> GetAll()
        {
            return (List<Produit>) this.repo.findAll();
        }


}
