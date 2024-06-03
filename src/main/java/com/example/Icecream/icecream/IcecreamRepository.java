package com.example.Icecream.icecream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IcecreamRepository extends JpaRepository<Icecream,Integer> {

    @Query("SELECT i FROM Icecream i WHERE i.flavour = ?1")
    Optional<Icecream> findIcreamFlavour(String flavour);



}
