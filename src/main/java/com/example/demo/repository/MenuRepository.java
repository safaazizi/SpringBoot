package com.example.demo.repository;

import com.example.demo.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> { //Long is the type of the primary key of the MEnu class
//    List<Menu> findByTypeMenuLike(String typeMenu);
//
//    void findBy();
//
//    void findById(int i);
}
