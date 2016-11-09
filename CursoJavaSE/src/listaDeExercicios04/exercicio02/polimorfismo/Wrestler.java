package listaDeExercicios04.exercicio02.polimorfismo;

import java.io.Serializable;

public abstract class Wrestler implements Serializable {
	
	// implementando a interface serializable
	private static final long serialVersionUID = 1L;

	//atributos
	private int damage;
	private String name;
	private String weight;
	private Brand brand;
	
	//construtores
	public Wrestler() {
		
	}

	public Wrestler(int damage, String name, String weight, Brand brand) {
		this.damage = damage;
		this.name = name;
		this.weight = weight;
		this.brand = brand;
	}
	
	//métodos
	public int punch() {
		System.out.println("punch...");
		return 50;
	}
	
	public int kick() {
		System.out.println("kicking...");
		return 60;
	}
	
	public abstract void finisher();
	
	
	//Getters and Setters
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
}
