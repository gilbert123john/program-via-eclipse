//read content from a url
package networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadingFromURL {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://asia.olympus-imaging.com/content/000090033.jpg");
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String s;
			while(s=reader.readLine()!=null) {
				
			}
//			System.out.println("String "+ url.toString());
//			System.out.println("protocol "+ url.getProtocol());
//			System.out.println("HostName "+ url.getHost());
//			System.out.println("Query "+ url.getQuery());
//			System.out.println("Port "+ url.getDefaultPort());
//			System.out.println("File "+ url.getFile());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
