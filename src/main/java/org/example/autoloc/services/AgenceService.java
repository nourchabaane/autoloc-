package org.example.autoloc.services;

import org.example.autoloc.entities.Agence;

import java.util.List;

public interface AgenceService {

    Agence addAgence(Agence agence);

    Agence updateAgence(Agence agence);

    List<Agence> retrieveAllAgences();

    Agence retrieveAgence(Long id);

    void removeAgence(Long id);
}
