package com.gstock.controller;


import com.gstock.entity.Produit;
import com.gstock.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {
    @Autowired
    private IProduitService produitService;

    @GetMapping
    public List<Produit> getProduit(){
        return produitService.getProduits();
    }

    @PostMapping
    public void addProduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }
    @PutMapping
    public void updateProduit(@RequestBody Produit produit){
        produitService.updateProduit(produit);
    }
    @DeleteMapping("/{ref}")
    public void deleteProduit(@PathVariable String ref){
        produitService.deleteProduit(ref);
    }

}
