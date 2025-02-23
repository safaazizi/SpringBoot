package com.example.demo.Services;

import com.example.demo.entity.Composant;

import java.util.List;

public interface IComposantService {
    List<Composant> retrieveAllComposant();
    Composant addComposant(Composant c);
    Composant updateComposant(Composant c);
    Composant retrieveComposant(Long idChaine);
    void removeComposant(Long idChaine);
    List<Composant> addComposant(List<Composant> composants);
}
