package com.example.hotelReservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelReservation.model.HotelDetails;
import com.example.hotelReservation.model.ReservationDetails;
import com.example.hotelReservation.repository.HotelDetailsRepository;

@RestController
public class HotelController {

	@Autowired
	private HotelDetailsRepository hotelDetailsRepository;
	
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
		return "Confirmation Number is 99999 for the hotel " + reservationDetails.getHotel_name();
	}
}
