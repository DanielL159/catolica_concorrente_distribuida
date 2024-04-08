package incrementer;

import entities.Contador;

public class Incrementer extends Thread{
	private Contador contador ;

	public Incrementer(Contador contador) {
		this.contador = contador;
	}

	public Contador getContador() {
		return contador;
	}

	public void setContador(Contador contador) {
		this.contador = contador;
	}


	public void run() {
		System.out.println(this.getName() + " esta incrementado");
		this.contador.plus();
	}
}
