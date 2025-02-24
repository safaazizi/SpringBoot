package com.example.demo.Services;

import com.example.demo.entity.Composant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ComposantService implements IComposantService {
    ComposantService composantService;
    @Override
    public List<Composant> retrieveAllComposant() {
        return List.of();
    }

    @Override
    public Composant addComposant(Composant c) {
        return null;
    }

    @Override
    public Composant updateComposant(Composant c) {
        return null;
    }

    @Override
    public Composant retrieveComposant(Long idChaine) {
        return null;
    }

    @Override
    public void removeComposant(Long idChaine) {

    }

    @Override
    public List<Composant> addComposant(List<Composant> composants) {
        return List.of();
    }
}
