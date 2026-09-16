package Paquete;

public class Purchase {

	private Customer customer;
	private Game game;
	private int quantity;
	private double totalPrice;

	public Purchase(int quantity, double totalPrice) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Game getGame() {
		return game;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalPrice() {
		return totalPrice*getQuantity();
	}

	
}
