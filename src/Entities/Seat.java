package entities;


import exceptions.AppException;

public class Seat {

	private String code;
	private double price;
	private String[] codeArray;

	public Seat() {
	}

	
	public Seat(String code, double price) {
		this.codeArray = code.split("");
		this.code = code;
		setPrice(price);
	}

	public Seat(String code) {
		this.codeArray = code.split("");
		this.code = code;
		setPrice(20.00);
	}

	public int getColumn() {
		int column;

		if (codeArray.length == 3) {
			column = Integer.parseInt(codeArray[1] + codeArray[2]);
		} else {
			column = Integer.parseInt(String.valueOf(codeArray[1]));
		}

		return column;
	}

	public char getRow() {
		try {
		if (codeArray != null && codeArray.length > 0) {
			return codeArray[0].charAt(0);
		} else {
			throw new AppException("Seat code is empty.");
		}
		} catch (AppException e) {
			System.err.println("Error: " + e);
		}
		return 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "price: " + String.format("%.2f", price) + ", code: " + code + ".";
	}
	
	

}
