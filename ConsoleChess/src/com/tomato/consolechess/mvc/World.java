package com.tomato.consolechess.mvc;

import java.util.ArrayList;
import java.util.List;

import com.tomato.consolechess.objects.Player;

public class World {
	List<Player> listaGraczy;
		
		World () {
			listaGraczy = new ArrayList<Player>();
			// ?
		}
		
		void dodajGracza(/* stefan */) {
			
			// stefan
			/* pomocna rzecz -> listaGraczy.size();
			 * -> listaGraczy.get(index);
			 * system out println...
			 * 
			 */
			listaGraczy.add(new Player(/* stefan */));
		}
		
		void pokazGracza(int id) {
			// stefan
		}
		
		void update() {
			int i = 0;
			while (i < listaGraczy.size()) {
				if (listaGraczy.get(i).dostepnosc) { // nie wiem czy koniecznie to powinna byæ dostêpnoœæ
					// stefan
					// system out println...
					
					// ->listaGraczy.get(i).update(ocena, iloscGoli);

				}
				i++;
			}
			
		}
		
		void mainLoop() {
			
		}
	
}
