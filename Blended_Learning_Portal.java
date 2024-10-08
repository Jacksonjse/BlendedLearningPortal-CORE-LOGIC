package login;
import java.util.*;
import java.util.Arrays;

class ScannerObj{
	private static final Scanner sc = new Scanner(System.in);
	private ScannerObj() {}
	public static Scanner getScanner() {
		return sc;
	}
}

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

class staff_data extends student_data{
	HashMap<String, Integer> data = new HashMap<>();
	public staff_data() {
		data.put("DURAI", 1185);
		data.put(null, null);
		data.put(null, null);
		data.put(null, null);
		data.put(null, null);
	}
}

class teammates{
	boolean team_mates_selected = false;
	Login lg = new Login();
	ArrayList<String[]> teams= new ArrayList<>();
	public teammates() {
		teams.add(new String[]{"URK23CS1047", "URK23CS1474"});
		teams.add(new String[]{"URK23CS1185", "URK23CS4560"});
		teams.add(new String[]{"URK23CS1044", "URK23CS4100"});
	}
	public boolean team_check() {
		if ( Arrays.asList(teams).contains(lg.urk)) {
			team_mates_selected = true;		
		}else {
			String urk_1, urk_2;
			System.out.println("seems like your team has not registered yet..");
			System.out.println("Enter member 1 reg.no: ");
			urk_1 = ScannerObj.getScanner().nextLine();
			System.out.println("Enter member 2 reg.no: ");
			urk_2 = ScannerObj.getScanner().nextLine();
			teams.add(new String[]{urk_1, urk_2});
			
			team_mates_selected = true;
		}
		return team_mates_selected;
	}
}

                                                                                   
class Login extends staff_data {
	public int response;
	public String urk;
	public int pass;
	public boolean login() {
		boolean flag = false;
		
		student_data stdata = new student_data();
		staff_data sfdata = new staff_data();
		
		//Scanner sc = new Scanner(System.in);
		System.out.println("LOGIN:\n");
		System.out.println("1. Student\n2. Faculty");
		System.out.println("Enter your option ");
		response = ScannerObj.getScanner().nextInt();
		ScannerObj.getScanner().nextLine();
		
		if (response == 1){
			System.out.print("Enter your Register Number: ");
			urk = ScannerObj.getScanner().nextLine();
			System.out.print("Enter your Password: ");
			pass = ScannerObj.getScanner().nextInt();
			ScannerObj.getScanner().nextLine();
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
				String new_urk = ScannerObj.getScanner().nextLine();
				System.out.println("Enter your Password: ");
				int new_pass = ScannerObj.getScanner().nextInt();
				stdata.data.put(new_urk, new_pass);
				System.out.println("SIGNED UP SUCCESSFULLY!!");
				flag = true;
			}
		}
		
		else {
			System.out.print("Enter your STAFF Register Number: ");
			urk = ScannerObj.getScanner().nextLine();
			System.out.print("Enter your STAFF Password: ");
			pass = ScannerObj.getScanner().nextInt();
			ScannerObj.getScanner().nextLine();
			if(sfdata.data.containsKey(urk)) {
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
				String new_urk = ScannerObj.getScanner().nextLine();
				System.out.println("Enter your NEW STAFF Password: ");
				int new_pass = ScannerObj.getScanner().nextInt();
				sfdata.data.put(new_urk, new_pass);
				System.out.println("SIGNED UP SUCCESSFULLY!!");
				flag = true;
			}
		}
		
		return flag;
	}
}

class student_front_page{
	public void students_front_page(){
		System.out.println("Student front page must be printed");
		Login lg = new Login();
		teammates tm = new teammates();
		
		if (tm.team_check()) {
			//proceed to show the full data
			//name and urk must be retrieved
			//the blended learning courses should be stored and retrieved
			//photo should be retrieved and shown
		}
	}
}

class staff_front_page{
	public void staff_front_page() {
		System.out.println("Staff front page must be printed");
	}
}
public class Blended_Learning_Portal extends Login{
	public static void main(String args[]) {
		
		Login lg = new Login();
		student_front_page std = new student_front_page();
		staff_front_page stf = new staff_front_page();
		if(lg.login()) {
			if(lg.response == 1) {
				std.students_front_page();
			}else {
				stf.staff_front_page();
			} 
		}else {
			System.out.println("Login Failed");
		}
	}
}
