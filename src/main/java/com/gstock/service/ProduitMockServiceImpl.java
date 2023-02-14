package com.gstock.service;

import com.gstock.entity.Produit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduitMockServiceImpl implements IProduitService{

    private List<Produit> produits;

    public ProduitMockServiceImpl(){
        produits = new ArrayList<Produit>();
        produits.add(new Produit( 1,"livre", 50., 20.5));
        produits.add(new Produit( 2,"cahier", 500. , 12.5));
        produits.add(new Produit( 3,"stylo", 500. , 1.5));
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
    public void deleteProduit(String ref) {
        Produit produit = new Produit();
        produit.setRef(ref);
        produits.remove(produit);

    }
}
