package org.example.autoloc.services;

import org.example.autoloc.entities.Employe;

import java.util.List;

public interface EmployeService {

    Employe addEmploye(Employe employe);

    Employe updateEmploye(Employe employe);

    List<Employe> retrieveAllEmployes();

    Employe retrieveEmploye(Long id);

    void removeEmploye(Long id);
}
