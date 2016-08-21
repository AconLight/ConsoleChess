package com.tomato.consolechess.objects;

public class Player {
	String nazwa;
	int iloscOcen;
	int sumaOcen;
	float ocenaGracza;
	int iloscGoli;
	public boolean dostepnosc;
	int id;
	
	public Player() {
		// stefan
	}
	
	public void ocenGracza(float ocena) {
		// stefan
	}
	
	public void update(float ocena, int iloscGoli) {
		ocenGracza(ocena);
		this.iloscGoli += iloscGoli;
	}
}
