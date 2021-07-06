package com.example.hotelReservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelReservation.model.Guests;
import com.example.hotelReservation.model.HotelDetails;
import com.example.hotelReservation.model.ReservationDetails;
import com.example.hotelReservation.repository.GuestsRepository;
import com.example.hotelReservation.repository.HotelDetailsRepository;
import com.example.hotelReservation.repository.ReserveHotelRepository;

@RestController
public class HotelController {

	@Autowired
	private HotelDetailsRepository hotelDetailsRepository;
	@Autowired
	private ReserveHotelRepository reserveHotelRepository;
	@Autowired
	private GuestsRepository guestsRepository;
	@RequestMapping("/ping")
	public String ping() {
		return "Service is up and running";
	}
	
	@RequestMapping("/getListOfHotels")
	public List<HotelDetails> hotelList() {
		List<HotelDetails> hotelList = hotelDetailsRepository.findAll();       
        return hotelList;
	}
	
	@RequestMapping(value="/reserveHotel",method=RequestMethod.POST,consumes="application/json")
	public String reserveHotel(@RequestBody ReservationDetails reservationDetails) {
		ReservationDetails reservation = new ReservationDetails();
		reservation.setHotel_id(reservationDetails.getHotel_id());
		reservation.setCheckin(reservationDetails.getCheckin());
		reservation.setCheckout(reservationDetails.getCheckout());
		reservation.setHotel_name(reservationDetails.getHotel_name());
		reservation.setGuests(reservationDetails.getGuests());
		/*
		 * reservation.getGuests().forEach(guest) => { guest.setHotel_id(reservation.)
		 * });
		 */
		
		reserveHotelRepository.save(reservation);
		//guestsRepository.saveAll(reservationDetails.getGuests());
		//guestsRepository.saveAll(reservationDetails.getGuests());
		return "Confirmation Number is  for the hotel " + reservationDetails.getHotel_name();
	}
}
