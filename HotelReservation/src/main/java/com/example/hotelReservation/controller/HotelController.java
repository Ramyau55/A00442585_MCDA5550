package com.example.hotelReservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelReservation.model.HotelDetails;
import com.example.hotelReservation.model.ReservationDetails;

@RestController
public class HotelController {

	@RequestMapping("/ping")
	public String ping() {
		return "Service is up and running";
	}
	
	@RequestMapping("/getListOfHotels")
	public List<HotelDetails> hotelList() {
		List<HotelDetails> hotelList = new ArrayList<HotelDetails>();
		HotelDetails hotel1 = new HotelDetails();
		hotel1.setHotel_name("A2B");
		hotel1.setPrice(1000);
		hotel1.setAvailability(true);
		HotelDetails hotel2 = new HotelDetails();
		hotel2.setHotel_name("Leela Palace");
		hotel2.setPrice(8000);
		hotel2.setAvailability(false);
		hotelList.add(hotel1);
		hotelList.add(hotel2);
		return hotelList;
	}
	
	@RequestMapping(value="/reserveHotel",method=RequestMethod.POST,consumes="application/json")
	public String reserveHotel(@RequestBody ReservationDetails reservationDetails) {		
		return "Confirmation Number is 99999 for the hotel " + reservationDetails.getHotel_name();
	}
}
