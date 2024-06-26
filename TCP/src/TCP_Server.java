import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {

	public static void main(String[] args) throws Exception {
		
		String clientSentence;
		String capitalSectence;
		
		System.out.println("Waiting for clients...");
		ServerSocket welcomeSocket = new ServerSocket(7777);
		
		while(true) {
			Socket connectionSocket = welcomeSocket.accept();
			System.out.println("Connection is established.");
			
			System.out.println("Getting client data");
			
			// for read the string that sent by client
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			
			clientSentence = inFromClient.readLine();
			System.out.println("mzg : " + clientSentence);
			
			capitalSectence = clientSentence.toUpperCase() + "\n";
			
			outToClient.writeBytes(capitalSectence);
		}

	}

}
