//3.	Write a program to download a file from a given URL
package set15;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class MainClass15_3 {

	public static void main(String[] args) {
		try {
			
			URL url = new URL("https://africau.edu/images/default/sample.pdf");
			InputStream inputStream = url.openStream();
			FileOutputStream fout = new FileOutputStream("downloadedFile.pdf");
			int l;//Length 
			byte[] b = new byte[2048];
			while((l=inputStream.read(b))!=-1) {
				fout.write(b,0,l);  //byte,offset,length
			}
			System.out.println("File Copied");
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
