package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "Commande")
@Getter
@Setter
@NoArgsConstructor

public class Commande {
    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "idMenu")
    private Menu menusCommande;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCommande;

    @Temporal(TemporalType.DATE)
    private Date dateCommande;
    private Integer pourcentageRemise;
    private float totalCommande;
    private Long note;

}
