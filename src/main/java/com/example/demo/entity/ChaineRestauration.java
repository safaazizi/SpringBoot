package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="ChaineRestauration")
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;
    private String libelle;
    //@Temporal(TemporalType.DATE) ki nestaamlou el Date
    private LocalDate dateCreation;
    @OneToMany(mappedBy = "chaineRestauration")
    List<Restaurant> resturants;
}
