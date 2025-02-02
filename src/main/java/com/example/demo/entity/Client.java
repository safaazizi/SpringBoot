package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table( name = "Client")
public class Client {
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private Long Identifiant;
    @Temporal(TemporalType.DATE)
    private Date PremiereVisite;

}
