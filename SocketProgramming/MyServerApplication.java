//import java.util.Scanner;
import java.net.*;
import java.io.*;

public class MyServerApplication {
	public static void main(String arg[]) {
		try {
			System.out.println("Waiting for clients...");
			ServerSocket ss = new ServerSocket(9999);
			Socket soc = ss.accept();
			System.out.println("Connected !!!");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String data = in.readLine();
			System.out.println(data);
			
			ss.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
