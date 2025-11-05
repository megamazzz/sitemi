import java.io.*;
import java.net.*;

public class CalcolatriceServer {
    private static final int PORTA = 8844;
    
    public static void main(String[] args) {
        // TODO: Implementa qui il server

	try (ServerSocket serverSocket = new ServerSocket(PORTA)) {
    		System.out.println(" Server avviato sulla porta " + PORTA);
    		// Accetta connessioni...

		while (true) {
    			Socket client = serverSocket.accept();
			System.out.println(" Client: in ascolto ");
    			// Gestisci comunicazione con client

			// Create input and output streams to read/write data
			DataInputStream inStream = new DataInputStream(clientSocket.getInputStream());
			DataOutputStream outStream = new DataOutputStream(clientSocket.getOutputStream());	

			String richiesta;
			
		}
		client.close();
		}

			// Esempio di parsing: "10 + 5"

			String[] parti = richiesta.split(" ");
			if (parti.length != 3) {
    				return "ERRORE: Formato non valido";
			}
			double num1 = Double.parseDouble(parti[0]);
			String operazione = parti[1];
			double num2 = Double.parseDouble(parti[2]);

			switch (operazione) {
    			case "+": return num1 + num2;
    			case "-": return num1 - num2;
    			case "*": return num1 * num2;
    			case "/": 
        		if (num2 == 0) throw new ArithmeticException("Divisione per zero");
        			return num1 / num2;
    				default: throw new IllegalArgumentException("Operazione non supportata");
			}
	}
    }
}
