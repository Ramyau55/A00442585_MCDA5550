package com.example.hotelReservation.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "guests")
public class Guests {
	@Id
    private int hotel_id;
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	private String guest_name;
	private String gender;

	public ReservationDetails getReservationDetails() {
		return reservationDetails;
	}
	public void setReservationDetails(ReservationDetails reservationDetails) {
		this.reservationDetails = reservationDetails;
	}
	/* Getters and Setters */
	public String getGuest_name() {
		return guest_name;
	}
	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "hotel_id")
    private ReservationDetails reservationDetails;
}
