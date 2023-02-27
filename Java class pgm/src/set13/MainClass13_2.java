/**
 * Write a program to implement communication between a client and server client, via Socket Programming
 * Client side.
 * udp - connection less.
 */
package set13;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MainClass13_2 {
	public static void main(String[] args) {
		try {
			int i=10;
			byte[] b = (String.valueOf(i).getBytes());
			DatagramSocket ds = new DatagramSocket();
			InetAddress my = InetAddress.getLocalHost();
			DatagramPacket dp = new DatagramPacket(b,b.length,my.getLocalHost(),1234);
			ds.send(dp);
			System.out.println("Sending Data");
			ds.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
