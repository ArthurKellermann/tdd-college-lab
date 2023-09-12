package Entities;

public class User {

	private String name;
	private String email;
	private String cpf;
	private Seat seat;

	public User() {
	}

	public User(String name, String email, String cpf, Seat seat) {
		setName(name);
		setEmail(email);
		setcpf(cpf);
		setSeat(seat);
	}

	public boolean isInteger(String str) {
		return str != null && str.matches("[0-9]*");
	}

	public boolean isCpf(String cpf) {
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || (cpf.length() != 11))
			return (false);
		
		return isInteger(cpf);
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

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

}
