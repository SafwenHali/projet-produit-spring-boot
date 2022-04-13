package com.safwen.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.safwen.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
