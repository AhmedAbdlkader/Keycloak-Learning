package com.inetum.firstproject.Repository;

import com.inetum.firstproject.Entity.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends CrudRepository<Produit, Integer> {
}
