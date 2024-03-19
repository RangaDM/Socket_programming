import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Client started");
		
		try {
			Socket soc = new Socket("localhost" , 9806);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
