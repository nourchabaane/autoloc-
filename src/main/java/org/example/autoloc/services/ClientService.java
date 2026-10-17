package org.example.autoloc.services;

import org.example.autoloc.entities.Client;

import java.util.List;

public interface ClientService {

    Client addClient(Client client);

    Client updateClient(Client client);

    List<Client> retrieveAllClients();

    Client retrieveClient(Long id);

    void removeClient(Long id);
}
