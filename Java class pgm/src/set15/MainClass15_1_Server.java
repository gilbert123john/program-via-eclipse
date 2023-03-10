//1.	Write a program to implement connection less communication.
package set15;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MainClass15_1_Server {

	public static void main(String[] args) {
		try {
			System.out.println("Server running");
			byte[] b1 = new byte[2048];
			DatagramSocket ds = new DatagramSocket(1234);
			DatagramPacket dp = new DatagramPacket(b1, b1.length);
			ds.receive(dp);
			String str = new String(dp.getData());
			System.out.println(str.trim());
			System.out.println("Data received and Updated");
			ds.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
