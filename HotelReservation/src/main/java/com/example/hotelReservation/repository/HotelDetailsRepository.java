package com.example.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelReservation.model.HotelDetails;

public interface HotelDetailsRepository extends JpaRepository<HotelDetails, Integer>{

}
