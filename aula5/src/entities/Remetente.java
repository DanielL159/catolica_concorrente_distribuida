package entities;

import java.util.concurrent.ThreadLocalRandom;

import process.Data;

public class Remetente implements Runnable {

	private Data data;
	private String[] message;
	
	public Remetente(Data data , String[] message) {
		this.data=data;
		this.message = message;
	}
	
	@Override
	public  void run() {
		for(String messageString : this.message) {
			int randomTime = ThreadLocalRandom.current().nextInt(3000,8000);
			
			try {
				//espero entre 3 a 8 segundos
				Thread.sleep(randomTime);
			} catch (InterruptedException e) {
				System.out.println("Thread foi interrompida");
			}
			data.send(messageString);
		}
	}

}
