package org.example.autoloc.services;

import org.example.autoloc.entities.Equipement;

import java.util.List;

public interface EquipementService {

    Equipement addEquipement(Equipement equipement);

    Equipement updateEquipement(Equipement equipement);

    List<Equipement> retrieveAllEquipements();

    Equipement retrieveEquipement(Long id);

    void removeEquipement(Long id);
}
