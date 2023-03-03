/**
 * Write a program to implement one-one chatting using the TCP protocol.
 * connection oriented
 */
package set13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MainClass13_3_Server {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);//to get input from client(keybord);
			
			ServerSocket serverSocket = new ServerSocket(1124);
			Socket socket = serverSocket.accept();//to accept connection from client
			DataInputStream serverInput = new DataInputStream(socket.getInputStream());//to get input from server
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());// give output to client
			System.out.println("Client Connected");
			
			String str;
			dout.writeUTF("Connected");
			while(true) {
				str = serverInput.readUTF();
				if(str.equals("#")) {
					break;
				}
				System.out.println("Client -> "+str);
				System.out.println("(breakpoint #) server to client ->");
				str=sc.nextLine();
				dout.writeUTF(str);
				if(str.equals("#")) {
					break;
				}
			}
			sc.close();
			socket.close();
			serverSocket.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
