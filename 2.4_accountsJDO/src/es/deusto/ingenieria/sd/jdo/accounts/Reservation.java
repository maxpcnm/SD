package es.deusto.ingenieria.sd.jdo.accounts;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Reservation {
	private Flight flight;
	private Date openDate;
	private Reservation reservation;

	public Reservation(Flight name, Date date, Reservation reservation) {
		this.setFlight(name);
		this.openDate = date;
		this.setReservation(reservation);
	}

	public Date getOpenDate() {
		return this.openDate;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}