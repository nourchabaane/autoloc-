package org.example.autoloc.services;

import org.example.autoloc.entities.Maintenance;

import java.util.List;

public interface MaintenanceService {

    Maintenance addMaintenance(Maintenance maintenance);

    Maintenance updateMaintenance(Maintenance maintenance);

    List<Maintenance> retrieveAllMaintenances();

    Maintenance retrieveMaintenance(Long id);

    void removeMaintenance(Long id);
}
