package com.tomato.consolechess.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tomato.consolechess.objects.Player;

public class World {
	List<Player> listaGraczy;
	Scanner scan = new Scanner(System.in);	
	InputHandler inputHandler = new InputHandler();
		public World () {
			listaGraczy = new ArrayList<Player>();
			// ?
		}
		
		public void dodajGracza() {
			
			System.out.println("JESTES PEWNIEN ZE CHCESZ DODAC GRACZA?\n" +
					"Y- TAK\n" +
					"N- NIE");
			String nazwa = scan.nextLine();
			if(nazwa.equals("N")){
				inputHandler.menu();
			}
			else if(nazwa.equals("Y")){
			System.out.println("PODAJ NICK: ");

			nazwa = scan.nextLine();
			
			System.out.println("PODAJ NICK: ");
			int iloscOcen = 0;
			int sumaOcen = 0;
			int iloscGoli = 0;
			float ocenaGracza = 0;
			int id = listaGraczy.size() + 1;
			// stefan
			/* pomocna rzecz -> listaGraczy.size();
			 * -> listaGraczy.get(index);
			 * system out println...
			 * 
			 */		
			listaGraczy.add(new Player(nazwa, iloscOcen, sumaOcen, iloscGoli, ocenaGracza, id));
			System.out.println("DODANO GRACZA " + nazwa);
			System.out.println(".................");
			}
			else{
				System.out.println("PODANO ZLA WARTOSC");
			}
			
			boolean x = true;
			while(x)
			System.out.println("1- DODAJ KOLEJNEGO GRACZA\n" +
					"0- MENU");
			String nav2 = scan.nextLine();
			
			if(nav2.equals("1")){
			dodajGracza();
			x = false;	
			}
			else if(nav2.equals("0")){
			inputHandler.menu();
			x = false;
			}
			else{
				System.out.println("PODANO ZLA WARTOSC");
				
			}
		//inputHandler.menu();
		}
			
		
		public void pokazGraczy(int id) {
			System.out.println("PODGLAD GRACZY");
			
			while(id < listaGraczy.size()){
	
				System.out.println("ID: " + id + "- " + listaGraczy.get(id).nazwa);
				id++;
			}
			System.out.println(".................");
	
		}
		
		public void pokazStatystyki(int id, String name){
			
			pokazGraczy(0);
			
			System.out.println("PODAJ ID GRACZA ZEBY ZOBACZYCZ JEGO STATYSTYKI\n" +
								"0- POWROT DO MENU");

			name = scan.nextLine();
			if(name.equals("0")){
				inputHandler.menu();
			}
			while(id > listaGraczy.size()){
				if(name.equals("id")){
					System.out.println(listaGraczy.get(id).nazwa + 
										", ILOSC GOLI: " + listaGraczy.get(id).iloscGoli +
										", OCENA GRACZA: " + listaGraczy.get(id).ocenaGracza + 
										"ID GRACZA: " + listaGraczy.get(id).id);
				}
				id++;
			}
			boolean x = true;
			while(x)
			System.out.println("1- ZOBACZ INNEGO GRACZA\n" +
					"0- MENU");
			name = scan.nextLine();
			
			if(name.equals("1")){
			pokazStatystyki(0, null);
			x = false;	
			}
			else if(name.equals("0")){
			inputHandler.menu();
			x = false;
			}
			else{
				System.out.println("PODANO ZLA WARTOSC");
				x = true;
			}
		}
		
		void update() {
			int id = 0;
			String nav;
			
			System.out.println("POTWIERDZ CZY CHCESZ ZROBIC UPDATE\n" +
					"Y- TAK\n" +
					"N- NIE");
			
			nav = scan.nextLine();
			if(nav.equals("N")){
				inputHandler.menu();
			}
			else if(nav.equals("Y")){
				
			while (id < listaGraczy.size()) {
				
				System.out.println(listaGraczy.get(id).id + "/" + listaGraczy.size() + listaGraczy.get(id).nazwa);
				
					// stefan
					// system out println...
					
					// ->listaGraczy.get(i).update(ocena, iloscGoli);
				
				
			
				
				id++;
			}
			}
			else{
				System.out.println("ZLA WARTOSC, WRACASZ DO MENU");
				inputHandler.menu();
			}
			
		}
		
		void mainLoop() {
			
		}
	
}
