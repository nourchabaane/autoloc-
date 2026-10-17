package org.example.autoloc.services.impl;

import org.example.autoloc.entities.Contrat;
import org.example.autoloc.repositories.ContratRepository;
import org.example.autoloc.services.ContratService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {

    private final ContratRepository contratRepository;

    // Injection de dependances par constructeur
    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat retrieveContrat(Long id) {
        return contratRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Contrat introuvable : id=" + id));
    }

    @Override
    public void removeContrat(Long id) {
        contratRepository.deleteById(id);
    }
}
