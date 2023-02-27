/**
 * Write a program to implement one-one chatting using the TCP protocol.
 * connection 
 */
package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MainClass13_3_Server {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(1124);
			Socket socket = serverSocket.accept();
			
			Scanner sc = new Scanner(System.in);//to get input from client(keybord);
			DataInputStream clientInput = new DataInputStream(socket.getInputStream());//to get input from client
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());// give output to client
			
			String str;
			//
			while(true) {
				System.out.println("Enter your message that need to be send to client ---breakpoint # --");
				str=sc.nextLine();
				dout.writeUTF(str);
				if(str.equals("#")) {
					break;
				}
				str = clientInput.readUTF();
				if(str.equals("#")) {
					break;
				}
				System.out.println("Message from Client is "+str);
				
			}
			sc.close();
			serverSocket.close();
			socket.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
