import java.io.*;
import java.net.Socket;

public class Client_1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Client started ...");
			Socket soc = new Socket("localhost",9808);
			
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			String txt = userInput.readLine();
			
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			out.println(txt);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String fromserver = in.readLine();
			
			System.out.println(fromserver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
