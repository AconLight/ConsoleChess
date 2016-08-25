package com.tomato.consolechess.mvc;

import java.util.Scanner;

public class InputHandler {
	public void menu(){
		World world = new World();
		boolean isRunning = true;
		boolean qwe = true;
		Scanner scann = new Scanner(System.in);
		String nav;
		
		System.out.println("***MENU***\n" +
				"1- DODAJ GRACZA\n" +
				"2- PODGLAD GRACZY\n " +
				"3- UPDATE PO MECZU" +
				"0- ZAKONCZ");
		
		nav = scann.nextLine();
		while(qwe == true){
		if(nav.equals("1")){
			world.dodajGracza();
			qwe = false;
		}
		else if(nav.equals("2")){
			world.pokazStatystyki(0, null);
			qwe = false;
		}
		else if(nav.equals("3")){
			world.update();
			qwe = false;
		}
		else if(nav.equals("0")){
			isRunning = false;
			qwe = false;
		}
		else{
			System.out.println("PODANO ZLA WARTOSC");
			qwe = true;
		}
	}
	}	
}
