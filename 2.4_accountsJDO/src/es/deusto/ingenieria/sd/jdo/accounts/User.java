package es.deusto.ingenieria.sd.jdo.accounts;

import java.util.List;
import java.util.ArrayList;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class User {
	@PrimaryKey
	private String username;
	private String password;
	private String fullName;

	@Persistent(mappedBy = "user", dependentElement = "true")
	@Join
	private List<Reservation> reservations = new ArrayList<>();
	

	public User(String username, String password, String fullName) {
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}

}