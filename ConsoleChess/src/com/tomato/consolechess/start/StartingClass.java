package com.tomato.consolechess.start;

import com.tomato.consolechess.mvc.InputHandler;
import com.tomato.consolechess.mvc.World;

public class StartingClass {

	
	public static void main(String[] args) {
		
		World world = new World();
		InputHandler inputHandler = new InputHandler();
		System.out.println(".............\n....");
		
		inputHandler.menu();
		
		
	}
}
