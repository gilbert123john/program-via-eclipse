/**
 * Write a program to implement one-one chatting using the TCP protocol.
 * connection oriented
 */
package set13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MainClass13_3_Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",1124);
			System.out.println("Sending a request to server");
			Scanner sc = new Scanner(System.in);//to get input from client(keybord);
			
			DataInputStream serverInput = new DataInputStream(socket.getInputStream());//to get input from server
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());// give output to server
			
			String str;
			while(true) {
				str = serverInput.readUTF();
				if(str.equals("#")) {
					break;
				}
				System.out.println("Message from server is "+str);
				System.out.println("Enter your message that need to be send ---breakpoint # --");
				str=sc.nextLine();
				dout.writeUTF(str);
				if(str.equals("#")) {
					break;
				}
			}
			sc.close();
			socket.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
