package com.example.api.entity;

public class Terrain {
    private Integer id;
    private Integer quantite;
    private String nom;
    private String descritpion;

    // Constructeurs, Getters et Setters

    public Terrain(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getDescription(){
        return descritpion;
    }

    public void setDescritpion(String descritpion){
        this.descritpion = descritpion;
    }

    public Integer getQuantite(){
        return quantite;
    }

    public void setQuantite(Integer quantite){
        this.quantite = quantite;
    }
}
