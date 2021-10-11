import java.util.Scanner;
public class Kursant {

	String fio;
	int age;
	String phone;
	String email;
	String category;

	public Kursant(){
		this.fio = "not empty";
		this.age = 0;
		this.phone = "not empty";
		this.email = "not empty";
		this.category = "not empty";
	}

	public Kursant(String fio, int age, String phone, String email, String category){
		this.fio = fio;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.category = category;
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
		
		System.out.print("Your category: ");
		this.category = scanner.nextLine();
	}

	public void printFIO(){
		System.out.print(this.fio);
	}

	public void printAll(){
		System.out.print("Name: " + this.fio + ", Age: " + this.age + ", Phone: " + this.phone + ", Email: " + this.email + ", Category: " + category + "\n");
	}

	public void lvlUp(int num) {
		this.age += num;
	}

}