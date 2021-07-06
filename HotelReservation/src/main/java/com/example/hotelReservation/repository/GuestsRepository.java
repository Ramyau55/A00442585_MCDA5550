package com.example.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelReservation.model.Guests;
import com.example.hotelReservation.model.ReservationDetails;

@Repository
public interface GuestsRepository extends JpaRepository<Guests, Integer>{

}
