package com.example.demo.Services;

import com.example.demo.entity.ChefCuisinier;

import java.util.List;

public interface IChefCuisinier {
    List<ChefCuisinier> retrieveAllChefCuisinier();
    ChefCuisinier addChefCuisinier(ChefCuisinier c);
    ChefCuisinier updateChefCuisinier(ChefCuisinier c);
    ChefCuisinier retrieveChefCuisinier(Long idChaine);
    void removeChefCuisinier(Long idChaine);
    List<ChefCuisinier> addChefCuisinier(List<ChefCuisinier> chefCuisiniers);
}
