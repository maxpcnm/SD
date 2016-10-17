package es.deusto.ingenieria.sd.jdo.accounts;

import java.util.ArrayList;

import javax.jdo.annotations.PrimaryKey;

public class Flight {

	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

	@PrimaryKey
	private String flightnumber;

	public Flight(ArrayList<Reservation> reservations, String flightnumber) {
		super();
		this.setReservations(reservations);
		this.setFlightnumber(flightnumber);
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

}
