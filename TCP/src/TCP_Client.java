import java.io.*;
import java.net.Socket;

public class TCP_Client {

	public static void main(String[] args) throws Exception {
		
		String sentence;
		String modSentence;
		
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		
		Socket clientSocket = new Socket("localhost" , 7777);
		
		System.out.println("Enter a string...");
		
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		sentence = inFromUser.readLine();
		
		outToServer.writeBytes(sentence + "\n");
		
		modSentence = inFromServer.readLine();
		
		System.out.println("From server : " + modSentence);
		
		clientSocket.close();
	}

}
