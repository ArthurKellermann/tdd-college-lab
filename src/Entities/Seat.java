package Entities;

public class Seat {

	public String code;
	private double price;

	public Seat() {
	}

	public Seat(String code, double price) {
		this.code = code;
		setPrice(price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
