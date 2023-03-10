//1.	Write a program to implement connection less communication.
package set15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MainClass15_1_Client {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String i;
			System.out.println("Enter your Contry :");
			i=sc.nextLine();
			byte[] b = (String.valueOf(i).getBytes());
			DatagramSocket ds = new DatagramSocket();
			InetAddress my = InetAddress.getLocalHost();
			DatagramPacket dp = new DatagramPacket(b, b.length, my.getLocalHost(), 1234);
			ds.send(dp);
			System.out.println("Sending Data");
			ds.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
