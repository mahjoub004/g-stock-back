package com.gstock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    private String ref;
    private Double quantite;
    private Double prix;

}
