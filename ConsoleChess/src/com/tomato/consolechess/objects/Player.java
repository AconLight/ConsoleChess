package com.tomato.consolechess.objects;

public class Player {
	public String nazwa;
	int iloscOcen;
	int sumaOcen;
	int iloscGoli;
	float ocenaGracza;
	int id;
	
	 public String getNazwa() {
	        return nazwa;
	 }
	
	public Player(String nazwa, int iloscOcen, int sumaOcen, int iloscGoli, float ocenaGracza, int id){
		this.nazwa = nazwa;
		this.iloscOcen = iloscOcen;
		this.sumaOcen = sumaOcen;
		this.iloscGoli = iloscOcen;
		this.ocenaGracza = ocenaGracza;
		this.id = id;
	}
	
	public void ocenGracza(float ocena) {


		
		
	}
	
	public void update(float ocena, int iloscGoli) {
		ocenGracza(ocena);
		this.iloscGoli += iloscGoli;
	}
}
