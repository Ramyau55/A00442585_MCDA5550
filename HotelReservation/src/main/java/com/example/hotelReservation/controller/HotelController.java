package com.example.hotelReservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.hotelReservation.model.HotelDetails;
import com.example.hotelReservation.model.ReservationDetails;
import com.example.hotelReservation.repository.HotelDetailsRepository;
import com.example.hotelReservation.repository.ReserveHotelRepository;

@RestController
public class HotelController extends WebSecurityConfigurerAdapter {

	@Autowired
	private HotelDetailsRepository hotelDetailsRepository;
	
	@Autowired
	private ReserveHotelRepository reserveHotelRepository;
	

	@Override
	protected void configure(HttpSecurity http) throws Exception 
    {
	    http
	     .csrf().disable()
	     .authorizeRequests().anyRequest().authenticated()
	     .and()
	     .httpBasic();
    }
	  
	/*
	 * API to check if server is up and running
	 * Method Type: GET
	 * Params: None
	 * Output : String
	 * Security: BAsicauth
	 */
	@RequestMapping("/ping")
	public String ping() {
		return "Service is up and running";
	}
	
	/*
	 * API to bring the list of hotel details such as hotel name,Price and availability
	 * Method Type: GET
	 * Params: None
	 * Output : Type of HotelDetails
	 * Security: BAsicauth
	 */
	@RequestMapping("/getListOfHotels")
	public List<HotelDetails> hotelList() {
		List<HotelDetails> hotelList = hotelDetailsRepository.findAll();       
        return hotelList;
	}
	
	/*
	 * API to reserve the hotel by updating the hotel booking details and it returns the booking confirmation number
	 * Method Type: Post
	 * Params: type of ReservationDetails
	 * Output : String
	 * Security: BAsicauth
	 */
	@RequestMapping(value="/reserveHotel",method=RequestMethod.POST,consumes="application/json")
	public String reserveHotel(@RequestBody ReservationDetails reservationDetails) {
		ReservationDetails reservation = new ReservationDetails();
	    reservation.setCheckin(reservationDetails.getCheckin());
	    reservation.setCheckout(reservationDetails.getCheckout());
	    reservation.setHotel_name(reservationDetails.getHotel_name());
	    // reservation.setGuests(reservationDetails.getGuests());
	    //reservationDetails.getGuests().forEach(guest -> guest.setReservationDetails(reservationDetails));
	    reserveHotelRepository.save(reservation);
		return "Your Booking Confirmation Number is "+999999 + " for the hotel " + reservationDetails.getHotel_name();
	}
}
