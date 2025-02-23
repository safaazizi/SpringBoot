package com.example.demo.Repositories;

import com.example.demo.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
    //1.1 Liste des commandes d'un client
    List<Commande> findByClientIdClient(Long id_client);

    //1.2 Liste des commandes d'un client dont la date commande entre deux dates
    List<Commande> findByClientIdClientAndDateCommandeBetween(Long id_client, LocalDate from, LocalDate to);

    //1.3 liste des commandes dont la date commande entre deux dates ordonné par note  croissant
    List<Commande> orderByNoteClientIdClientAndDateCommandeBetween(Long id_client, LocalDate from, LocalDate to);





}
