package com.example.hotelReservation.model;

import java.util.List;

public class ReservationDetails {
	private String hotel_name;
	private String checkin;
	private String checkout;
	private List<Guests> guests_list;
	
	/* Setters and getters for the properties */
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public List<Guests> getGuests_list() {
		return guests_list;
	}
	public void setGuests_list(List<Guests> guests_list) {
		this.guests_list = guests_list;
	}    

}
