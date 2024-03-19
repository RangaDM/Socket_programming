import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Waiting for clients ...");
			ServerSocket ss = new ServerSocket(9808);
			Socket soc = ss.accept();
			System.out.println("Connection is established ...");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str = in.readLine();
			String str2 = str.toUpperCase();
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println("From server :" + str2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
