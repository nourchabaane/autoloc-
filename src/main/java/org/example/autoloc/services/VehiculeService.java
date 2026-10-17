package org.example.autoloc.services;

import org.example.autoloc.entities.Vehicule;

import java.util.List;

public interface VehiculeService {

    Vehicule addVehicule(Vehicule vehicule);

    Vehicule updateVehicule(Vehicule vehicule);

    List<Vehicule> retrieveAllVehicules();

    Vehicule retrieveVehicule(Long id);

    void removeVehicule(Long id);
}
