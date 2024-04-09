package entities;

import java.util.concurrent.ThreadLocalRandom;

import process.Data;

public class Destinatario implements Runnable{
	private Data data;
	
	public Destinatario(Data data) {
		this.data=data;
	}
	
	@Override
	public void run() {
		while (true) {
			String messageString = data.receiver();
			int randomTime = ThreadLocalRandom.current().nextInt(3000,8000);
			
			try {
				//espero entre 3 a 8 segundos
				Thread.sleep(randomTime);
			} catch (InterruptedException e) {
				System.out.println("Thread foi interrompida");
			}
			
			if (messageString == "END") {
				System.out.println("Nao ha mais mensagem a receber...");
				break;
			}
			
		}
		
	}

}
