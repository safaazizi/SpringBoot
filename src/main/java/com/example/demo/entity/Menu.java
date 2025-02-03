package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Menu")
public class Menu {
    @OneToMany(mappedBy = "menusCommande")
    List<Commande> commandeMenu;

    @ManyToMany(mappedBy = "menus")
    List<ChefCuisinier> chefs;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    @Enumerated(EnumType.STRING) //string maaneha yekhou esemi el enumarates || ordinaire 0.1.2
    private TypeMenu typeMenu;
    private Float prixTotal;



}

