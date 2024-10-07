package login;
import java.util.*;

class student_data{
	static HashMap<String, Integer> data = new HashMap<>(); 
	public student_data(){
		data.put("URK23CS1047", 22122005);
		data.put("URK23CS1044", 10032005);
		data.put("URK23CS1011", 292005); // should not use dobs starting with 0
		data.put("URK23CS1260", 22122005);
		data.put("URK23CS1250", 862005);
	}
}

class staff_data{
	HashMap<String, Integer> data = new HashMap<>();
	public staff_data() {
		data.put(null, null);
		data.put(null, null);
		data.put(null, null);
		data.put(null, null);
		data.put(null, null);
	}
}
                                                                                       
public class login extends student_data {
	
	public static void main(String args[]) {
		
		boolean flag = false;
		
		student_data stdata = new student_data();
		staff_data sfdata = new staff_data();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("LOGIN:\n");
		System.out.println("1. Student\n2. Faculty");
		System.out.println("Enter your option ");
		int response = sc.nextInt();
		sc.nextLine();
		
		if (response == 1){
			System.out.print("Enter your Register Number: ");
			String urk = sc.nextLine();
			System.out.print("Enter your Password: ");
			int pass = sc.nextInt();
			sc.nextLine();
			if(stdata.data.containsKey(urk)) {
				if (pass == stdata.data.get(urk)){
					System.out.println("Login successful");
					flag = true;
				}else {
					System.out.println("Failed");
				}	
			}else {
				System.out.println("it seems like the reg. no does not esist in the database...");
				System.out.println("SIGN UP:");
				System.out.println("Enter your Register Number: ");
				String new_urk = sc.nextLine();
				System.out.println("Enter your Password: ");
				int new_pass = sc.nextInt();
				stdata.data.put(new_urk, new_pass);
				System.out.println("SIGNED UP SUCCESSFULLY!!");
				flag = true;
			}
		}
		
		else {
			System.out.print("Enter your STAFF Register Number: ");
			String urk = sc.nextLine();
			System.out.print("Enter your STAFF Password: ");
			int pass = sc.nextInt();
			sc.nextLine();
			if(stdata.data.containsKey(urk)) {
				if (pass == sfdata.data.get(urk)){
					System.out.println("Login successful");
					flag = true;
				}else {
					System.out.println("Failed");
				}
			}else {
				System.out.println("it seems like the reg. no does not esist in the database...");
				System.out.println("SIGN UP:");
				System.out.println("Enter your STAFF Register Number: ");
				String new_urk = sc.nextLine();
				System.out.println("Enter your NEW STAFF Password: ");
				int new_pass = sc.nextInt();
				sfdata.data.put(new_urk, new_pass);
				System.out.println("SIGNED UP SUCCESSFULLY!!");
				flag = true;
			}
		}
	}
}
