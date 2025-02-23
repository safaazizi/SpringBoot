package com.example.demo.Repositories;

import com.example.demo.entity.Menu;
import com.example.demo.entity.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> , CrudRepository<Menu,Long> {
    // 2.1 List nom Menu Par le type Menu Ordonne Par PrixTotal
    @Query ("select m.libelleMenu from Menu m where m.typeMenu =:typeMenu order by m.prixTotal" )
    List<String>findByTypeMenu(@Param("typeMenu") TypeMenu typeMenu);

    //2.2 list Menu Par TypeComposant (exemple : les menus contenant de la viande blanche)
   // @Query("select m from Menu m join m.composants c where c =:composant  ")
}
