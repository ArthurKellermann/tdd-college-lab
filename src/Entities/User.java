package Entities;

import Application.Seat;

public class User {

	private String name;
	private String email;
	private String cpf;
	private Seat seat;

	public User() {
	}

	public User(String name, String email, String cpf, Seat seat) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.seat = seat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	
}
