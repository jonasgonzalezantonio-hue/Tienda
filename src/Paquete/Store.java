package Paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	Scanner sc = new Scanner(System.in);

	private ArrayList<Game> games = new ArrayList<Game>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<Purchase> purchases = new ArrayList<Purchase>();

	public void aniadirVideojuego() {
		System.out.println("Dime el titulo del juego");
		String nombre = sc.next();
		System.out.println("Dime el genero del juego");
		Genre genero = Genre.valueOf(sc.next().toUpperCase());
		System.out.println("Dime el precio del juego");
		Double precio = sc.nextDouble();
		System.out.println("Dime la cantidad de copias que va a haber en stock");
		int stock = sc.nextInt();
		games.add(new Game(nombre, genero, precio, stock));
	}

	public void buscarVideojuego() {
		System.out.println("Dime la id del juego que deseas buscar");
		int id = sc.nextInt();

		for (Game juego : games) {
			if (juego.getId() == id) {
				System.out.println(juego);
				return;
			}
		}

		System.out.println("No se ha encontrado ningún videojuego con esa ID");
	}

	public void buscarCliente() {
		System.out.println("Dime la id del cliente que deseas buscar");
		int id = sc.nextInt();

		for (Customer cliente : customers) {
			if (cliente.getId() == id) {
				System.out.println(cliente);
				return;
			}
		}

		System.out.println("No se ha encontrado ningún cliente con esa ID");
	}

	public void buscarPorTexto() {
		System.out.println("¿Qué juego desea buscar?");
		String texto = sc.next();

		boolean encontrado = false;

		for (Game juego : games) {
			if (juego.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
				System.out.println(juego);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se ha encontrado ningún juego con ese texto");
		}
	}

	public void filtrarPorGenero() {
		
	}

	public void comprarVideojuego() {

	}
}
