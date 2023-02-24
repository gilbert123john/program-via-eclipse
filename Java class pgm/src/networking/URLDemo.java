package networking;

import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://rajagiri.edu/");
			System.out.println("String "+ url.toString());
			System.out.println("protocol "+ url.getProtocol());
			System.out.println("HostName "+ url.getHost());
			System.out.println("Query "+ url.getQuery());
			System.out.println("Port "+ url.getDefaultPort());
			System.out.println("File "+ url.getFile());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
