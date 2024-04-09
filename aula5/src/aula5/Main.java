package aula5;

import java.util.Locale;

import entities.Destinatario;
import entities.Remetente;
import process.Data;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Data data = new Data();
		String[] message = {"1","2","3","4","END"};
		
		Thread sender = new Thread( new Remetente(data , message)) ;
		Thread receiver = new Thread(new Destinatario(data));
		
		sender.start();
		receiver.start();
	}

}
