package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Composant")
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;
    private String nomComposant;
    private Float prix;

    @OneToOne //besh nakes aala rouhy el details f base de donne
    //ki tabda unidirectionnel besh neproteji el table lokhra
    private DetailComposant details;
}
