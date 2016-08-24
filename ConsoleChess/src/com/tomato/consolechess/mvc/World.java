package com.tomato.consolechess.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tomato.consolechess.objects.Player;

public class World {
	static List<Player> listaGraczy;
	static Scanner scan = new Scanner(System.in);	
	
		World () {
			listaGraczy = new ArrayList<Player>();
			// ?
		}
		
		public static void dodajGracza() {
			
			System.out.println("DODAWANIE NOWEGO GRACZA");
			System.out.println("PODAJ NICK: ");

			String nazwa = scan.nextLine();
			
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
		}
		
		public static void pokazGraczy(int id) {
			System.out.println("PODGLAD GRACZY");
			
			while(id > listaGraczy.size()){
	
				System.out.println("ID: " + id + " " + listaGraczy.get(id).nazwa);
				id++;
			}
	
		}
		
		public void pokazStatystyki(int id, String name){

			System.out.println("PODAJ ID GRACZA ZEBY ZOBACZYCZ JEGO STATYSTYKI");

			name = scan.nextLine();
			
			while(id > listaGraczy.size()){
				if(name.equals("id")){
					System.out.println(listaGraczy.get(id).nazwa + 
										", ILOSC GOLI: " + listaGraczy.get(id).iloscGoli +
										", OCENA GRACZA: " + listaGraczy.get(id).ocenaGracza + 
										"ID GRACZA: " + listaGraczy.get(id).id);
				}
				id++;
			}
		
		}
		
		void update() {
			int i = 0;
			while (i < listaGraczy.size()) {
				
					// stefan
					// system out println...
					
					// ->listaGraczy.get(i).update(ocena, iloscGoli);

			
				i++;
			}
			
		}
		
		void mainLoop() {
			
		}
	
}
