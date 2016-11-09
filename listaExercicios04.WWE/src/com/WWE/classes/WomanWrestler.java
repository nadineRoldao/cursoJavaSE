package com.WWE.classes;

import java.io.Serializable;

import com.WWE.interfaces.FinalSkill;
import com.WWE.interfaces.SpecialHit;

public class WomanWrestler extends Wrestler implements Serializable, SpecialHit, FinalSkill{

	private static final long serialVersionUID = 1L;

	public int kick() {
		return 100;
	}
	
	public int punch() {
		return 80;
	}

	@Override
	public int jump() {
		// TODO Auto-generated method stub
		return 100;
	}


	@Override
	public void finisher(String finisherName) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int primaryHit(String hitName) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int secondaryHit(String hitName) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
