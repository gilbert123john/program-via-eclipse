/**
 * Write a program to implement communication between a client and server client, via Socket Programming
 * Server side.
 */
package set13;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MainClass13_2_1 {

	public static void main(String[] args) {
		try {
			byte[] b1= new byte[2048];
			DatagramSocket ds = new DatagramSocket(1234);
			DatagramPacket dp = new DatagramPacket(b1,b1.length);
			ds.receive(dp);
			String str =new String(dp.getData());
			int num = Integer.parseInt(str.trim());
			num++;
			System.out.println(num);
			System.out.println("Data received and Updated");
			ds.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
