package model.entities;

import model.exceptions.DomainException;

public class User {

	private String name, email, cpf;
	private Seat seat;

	public User() {
	}

	public User(String name, String email, String cpf) {
		setName(name);
		setEmail(email);
		setCpf(cpf);
	}

	public boolean isCpf(String cpf) {
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || (cpf.length() != 11))
			return false;

		return true;
	}

	public boolean isEmail(String email) {
		if (email.contains("@") == false) {
			return false;
		}

		return true;
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

	public boolean setEmail(String email) {
		try {
			if (isEmail(email) == false) {
				throw new DomainException("Invalid email");
			}

			this.email = email;

			return true;

		} catch (DomainException e) {
			System.err.println("Error: " + e.getMessage());
		}
		return false;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {
		try {
			if (isCpf(cpf) == false) {
				throw new DomainException("Invalid cpf");
			}

			this.cpf = cpf;

			return true;

		} catch (DomainException e) {
			System.err.println("Error: " + e.getMessage());
		}
		return false;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Email: " + email + ", CPF: " + cpf + ", Seat = " + seat;
	}

}
