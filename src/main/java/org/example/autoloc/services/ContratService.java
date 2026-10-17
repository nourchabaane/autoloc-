package org.example.autoloc.services;

import org.example.autoloc.entities.Contrat;

import java.util.List;

public interface ContratService {

    Contrat addContrat(Contrat contrat);

    Contrat updateContrat(Contrat contrat);

    List<Contrat> retrieveAllContrats();

    Contrat retrieveContrat(Long id);

    void removeContrat(Long id);
}
