package com.example.demo.Services;

import com.example.demo.entity.Commande;

import java.util.List;

public interface ICommandeService{
    List<Commande> retrieveAllCommande();
    Commande addCommande(Commande c);
    Commande updateCommande(Commande c);
    Commande retrieveCommande(Long idChaine);
    void removeCommande(Long idChaine);
    List<Commande> addCommande(List<Commande> commandes);
}
