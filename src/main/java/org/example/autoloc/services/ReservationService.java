package org.example.autoloc.services;

import org.example.autoloc.entities.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation addReservation(Reservation reservation);

    Reservation updateReservation(Reservation reservation);

    List<Reservation> retrieveAllReservations();

    Reservation retrieveReservation(Long id);

    void removeReservation(Long id);
}
