package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ChefCuisinier")
public class ChefCuisinier {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated
    private TypeChef typeChef;

    @ManyToMany
    private List <Menu> menus;



}
