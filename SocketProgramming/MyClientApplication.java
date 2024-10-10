//import java.util.Scanner;
import java.net.*;
import java.io.*;

public class MyClientApplication {
	public static void main(String arg[]) {
		try {
			System.out.println("Server Started...");
			System.out.println("Client Started...");
			Socket soc = new Socket("localhost",9999);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a String: ");
			String data = in.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			out.println("Client: "+data);
			soc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
