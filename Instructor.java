import java.util.Scanner;
public class Instructor {

	String fio;
	int age;
	String phone;
	String email;
	int exp;

	public Instructor(){
		this.fio = "not empty";
		this.age = 0;
		this.phone = "not empty";
		this.email = "not empty";
		this.exp = 0;
	}

	public Instructor(String fio, int age, String phone, String email, int exp){
		this.fio = fio;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.exp = exp;
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name: ");
		this.fio = scanner.nextLine();
		System.out.print("Your age: ");
		this.age = scanner.nextInt();
		
		System.out.print("Your phone: ");
		this.phone = scanner.nextLine();
		scanner.nextLine();

		System.out.print("Your email: ");
		this.email = scanner.nextLine();
		
		System.out.print("Your expirience: ");
		this.exp = scanner.nextInt();
	}

	public void printFIO(){
		System.out.print(this.fio);
	}

	public void printAll(){
		System.out.print("Name: " + this.fio + ", Age: " + this.age + ", Phone: " 
			+ this.phone + ", Email: " + this.email + ", Expirience: " + exp + "\n");
	}

	public void lvlUp(int num) {
		this.exp += num;
	}
}