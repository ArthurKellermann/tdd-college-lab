package Entities;

public class Seat {

	private double price;
	private String[] code;

	public Seat() {
	}

	public Seat(String code, double price) {
		this.code = code.split("");
		setPrice(price);
	}

	public Seat(String code) {
		this.code = code.split("");
		setPrice(20.00);
	}

	public int getColumn() {
		int column;

		if (code.length == 3) {
			column = Integer.parseInt(code[1] + code[2]);
		} else {
			column = Integer.parseInt(String.valueOf(code[1]));
		}

		return column;
	}

	public char getRow() {
		if (code != null && code.length > 0) {
			return code[0].charAt(0);
		} else {
			throw new IllegalStateException("Seat code is empty.");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
