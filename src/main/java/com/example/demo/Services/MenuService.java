package com.example.demo.Services;

import com.example.demo.entity.Menu;
import com.example.demo.Repositories.MenuRepository;

import java.util.List;

public class MenuService implements IMenuService{
    MenuRepository menuRepository;
    @Override
    public List<Menu> retrieveAllMenu() {
        return menuRepository.findAll();
    }

    @Override
    public Menu addMenu(Menu c) {
        return menuRepository.save(c);
    }

    @Override
    public Menu updateMenu(Menu c) {
        return menuRepository.save(c);
    }

    @Override
    public Menu retrieveMenu(Long idChaine) {
        return menuRepository.findById(idChaine).get();
    }

    @Override
    public void removeMenu(Long idChaine) {
        menuRepository.deleteById(idChaine);
    }

    @Override
    public List<Menu> addMenu(List<Menu> menus) {
        return null;
    }
}
