package Paquete;

import java.util.Scanner;

public class Customer {
	Scanner sc = new Scanner(System.in);

	private int id = 0;
	private String name;
	private double balance;

	public Customer(int id, String name, double balance) {
		super();
		this.id = id + 1;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public double aumentarSaldo(double balance) {
		double aumento = sc.nextDouble();
		while (aumento < 0) {
			System.out.println("Introduzca un numero mayor a 0");
		}
		return aumento + getBalance();
	}

	public double reducirSaldo(double balance) {
		double reduccion = sc.nextDouble();
		while (reduccion < 0) {
			System.out.println("Introduzca un numero mayor a 0");
			while (getBalance() - reduccion < 0) {
				System.out.println("El saldo no puede ser menor a 0");
			}
		}
		return getBalance() - reduccion;
	}

	public boolean comprobarCantidad(double balance) {
		double cantidad = sc.nextDouble();
		if (balance >= cantidad) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Customer [sc=" + sc + ", id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
