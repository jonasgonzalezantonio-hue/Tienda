package Paquete;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	private int id = 0;
	private String titulo;
	private Genre genre;
	private double precio;
	private int stock;

	public Game(int id, String titulo, Genre genre, double precio, int stock) {
		super();
		this.id = id + 1;
		this.titulo = titulo;
		this.genre = genre;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Genre getGenre() {
		return genre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int aumentarStock(int stock) {
		int aumento = sc.nextInt();
		while (aumento <= 0) {
			System.out.println("Introduzca un numero mayor a 0");
		}
		return aumento + getStock();
	}

	public int reducirStock(int stock) {
		int reduccion = sc.nextInt();
		while (reduccion <= 0) {
			System.out.println("Introduzca un numero mayor a 0");
		}
		return getStock() - reduccion;
	}

	public boolean unidadesDisponibles(int stock) {
		if (stock > 0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", titulo=" + titulo + ", genre=" + genre + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}

}
