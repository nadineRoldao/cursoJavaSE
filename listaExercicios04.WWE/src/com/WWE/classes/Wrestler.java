package com.WWE.classes;

import java.io.Serializable;

import com.WWE.enums.Division;

public abstract class Wrestler implements Serializable {
	
	//implementando a interface serializable
	private static final long serialVersionUID = 1L;
	
	//atributos
	private String name;
	private float weight;
	private int damagePoint;
	private Division division;
	
	//construtor
	public Wrestler(String name, float weight, int damagePoint, Division division) {
		this.name = name;
		this.weight = weight;
		this.damagePoint = damagePoint;
		this.division = division;
	}

	public Wrestler() {
		
	}

	//métodos
	public int kick() {
		return 50;
	}
	
	public int punch() {
		return 30;
	}
	
	public abstract int jump();
	
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getDamagePoint() {
		return damagePoint;
	}

	public void setDamagePoint(int damagePoint) {
		this.damagePoint = damagePoint;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

}
