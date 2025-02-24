package com.example.demo.Services;

import com.example.demo.entity.ChefCuisinier;
import com.example.demo.Repositories.ChefCuisinierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ChefCuisinierService implements IChefCuisinier{

    ChefCuisinierRepository cuisinierRepository;
    @Override
    public List<ChefCuisinier> retrieveAllChefCuisinier() {
        return cuisinierRepository.findAll();
    }

    @Override
    public ChefCuisinier addChefCuisinier(ChefCuisinier c) {
        return cuisinierRepository.save(c);
    }

    @Override
    public ChefCuisinier updateChefCuisinier(ChefCuisinier c) {
        return cuisinierRepository.save(c);
    }

    @Override
    public ChefCuisinier retrieveChefCuisinier(Long idChaine) {
        return cuisinierRepository.findById(idChaine).get();
    }

    @Override
    public void removeChefCuisinier(Long idChaine) {
            cuisinierRepository.deleteById(idChaine);
    }

    @Override
    public List<ChefCuisinier> addChefCuisinier(List<ChefCuisinier> chefCuisiniers) {
        return cuisinierRepository.saveAll(chefCuisiniers);
    }
}
