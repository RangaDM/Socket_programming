import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		try {
			System.out.println("Waiting for clients requests...");
			ServerSocket ss = new ServerSocket(9806);
			
			Socket osc = ss.accept(); // blocking call. its wait untill come a req from client
			
			System.out.println("Connection is establish...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
