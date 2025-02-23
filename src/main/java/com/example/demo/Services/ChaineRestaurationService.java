package com.example.demo.Services;

import com.example.demo.entity.ChaineRestauration;
import com.example.demo.Repositories.ChaineRestaurationRepository;

import java.util.List;

public class ChaineRestaurationService implements IChaineRestaurationService{

    ChaineRestaurationRepository chaineRestaurationRepository;
    @Override
    public List<ChaineRestauration> retrieveAllChaineResataution() {
        return chaineRestaurationRepository.findAll();
    }

    @Override
    public ChaineRestauration addChaineResataution(ChaineRestauration c) {
        return chaineRestaurationRepository.save(c);
    }

    @Override
    public ChaineRestauration updateChaineResataution(ChaineRestauration c) {
        return chaineRestaurationRepository.save(c);
    }

    @Override
    public ChaineRestauration retrieveChaineResataution(Long idChaine) {
        return chaineRestaurationRepository.findById(idChaine).get();
    }

    @Override
    public void removeChaineResataution(Long idChaine) {
            chaineRestaurationRepository.deleteById(idChaine);
    }

    @Override
    public List<ChaineRestauration> addChaineResataution(List<ChaineRestauration> chaineRestaurations) {
        return chaineRestaurationRepository.saveAll(chaineRestaurations);
    }
}
