package com.example.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelReservation.model.ReservationDetails;

@Repository
public interface ReserveHotelRepository extends JpaRepository<ReservationDetails, Integer>{

}
