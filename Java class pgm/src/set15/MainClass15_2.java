//2.	Write a program to get protocol, file name, host, path and port of a given URL
package set15;
import java.net.URL;

public class MainClass15_2 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://rajagiri.edu/");
			System.out.println("The protocol is "+url.getProtocol());
			//System.out.println("The file name is "+url.getFile());//file name is not found
			System.out.println("The host is "+url.getHost());
			System.out.println("The path is "+url.getPath().toString());
			System.out.println("The port is "+url.getDefaultPort());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
