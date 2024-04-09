package process;

public class Data {
	private String message;
	private boolean isSending = true;

	public synchronized void send(String message) {
		// so posso enviar se nao tiver acontecendo o recebimento

		// equando nao estou enviando , estou recebendo
		while (!isSending) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.message = message;
		System.out.print("Mensagem enviada: " + this.message);

		this.isSending = false;
		notify();// notifico que ja enviei e pode acontecer o recebimento
	}

	public synchronized String receiver() {
		// so posso receber se nao tiver acontecendo o envio

		while (isSending) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String receiveMensage = this.message;
		System.out.println("Mensagem recebida: " + receiveMensage);
		this.isSending = true;
		notify();
		return receiveMensage;
	}

}
