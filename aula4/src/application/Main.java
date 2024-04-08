package application;

import entities.Contador;
import incrementer.Incrementer;

public class Main {

	public static void main(String[] args) {
		Contador contador = new Contador(0);
		
		Incrementer incrementer = new Incrementer(contador);
		Incrementer incrementer1 = new Incrementer(contador);
		Incrementer incrementer2 = new Incrementer(contador);
		Incrementer incrementer3 = new Incrementer(contador);
		
		incrementer.run();
		incrementer1.run();
		incrementer2.run();
		incrementer3.run();
		
		 
	}

}
