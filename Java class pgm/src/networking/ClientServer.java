package networking;
import java.net.*;
public class ClientServer {//client side

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",1234);
			System.out.println("Sending a request to server");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
