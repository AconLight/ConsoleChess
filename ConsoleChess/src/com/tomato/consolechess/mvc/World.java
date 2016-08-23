package com.tomato.consolechess.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tomato.consolechess.objects.Player;

public class World {
	List<Player> listaGraczy;
	Scanner scan = new Scanner(System.in);	
	
		World () {
			listaGraczy = new ArrayList<Player>();
			// ?
		}
		
		public void dodajGracza(/* stefan */) {
			
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
		
		public void pokazGracza(int id) {
			System.out.println("PODGLAD GRACZAY");
			
			while(id > listaGraczy.size()){
	
				System.out.println(listaGraczy.get(id).nazwa);
				id++;
			}
			
			
			System.out.println("PODAJ ID GRACZA ZEBY ZOBACZYCZ JEGO STATYSTYKI");
			
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
