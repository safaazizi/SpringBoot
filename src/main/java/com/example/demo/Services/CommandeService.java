package com.example.demo.Services;

import com.example.demo.entity.Commande;
import com.example.demo.Repositories.CommandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class CommandeService implements ICommandeService{

    CommandeRepository commandeRepository;
    @Override
    public List<Commande> retrieveAllCommande() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande addCommande(Commande c) {
        return commandeRepository.save(c);
    }

    @Override
    public Commande updateCommande(Commande c) {

        return commandeRepository.save(c);
    }

    @Override
    public Commande retrieveCommande(Long idChaine) {

        return commandeRepository.findById(idChaine).get();
    }

    @Override
    public void removeCommande(Long idChaine) {
            commandeRepository.deleteById(idChaine);
    }

    @Override
    public List<Commande> addCommande(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }
}
