package org.example.autoloc.services;

import org.example.autoloc.entities.Paiement;

import java.util.List;

public interface PaiementService {

    Paiement addPaiement(Paiement paiement);

    Paiement updatePaiement(Paiement paiement);

    List<Paiement> retrieveAllPaiements();

    Paiement retrievePaiement(Long id);

    void removePaiement(Long id);
}
