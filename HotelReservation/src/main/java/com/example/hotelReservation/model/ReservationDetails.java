package com.example.hotelReservation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reserve_hotel")
public class ReservationDetails {
	@Id
	@GeneratedValue
	private int hotel_id;
	private String hotel_name;
	private String checkin;
	private String checkout;
	
	@OneToMany(mappedBy = "reservationDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Guests> guests;
	
	public ReservationDetails() {}
	
	public ReservationDetails(int hotel_id, String hotel_name, String checkin, String checkout, List<Guests> guests) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.checkin = checkin;
		this.checkout = checkout;
		this.guests = guests;
	}
	/* Setters and getters for the properties */
	
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
 
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
	
	public List<Guests> getGuests() {
		return guests;
	}
	public void setGuests(List<Guests> guests) {
		this.guests = guests;
	}
	

}
