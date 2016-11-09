package com.WWE.classes;

import java.io.Serializable;

public class LocalWrestler extends Wrestler implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public int kick() {
		return 30;
	}
	
	public int punch() {
		return 10;
	}
	
	@Override
	public int jump() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}
