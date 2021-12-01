import java.util.Scanner;
public class Manager {

	String fio;
	int age;
	String phone;

	public Manager(){
		this.fio = "not empty";
		this.age = 0;
		this.phone = "not empty";
	}

	public Manager(String fio, int age, String phone){
		this.fio = fio;
		this.age = age;
		this.phone = phone;
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name: ");
		this.fio = scanner.nextLine();
		
		System.out.print("Your age: ");
		this.age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Your phone: ");
		this.phone = scanner.nextLine();
	}

	public void printFIO(){
		System.out.print(this.fio);
	}

	public void printAll(){
		System.out.print("Name: " + this.fio + ", Age: " 
			+ this.age + ", Phone: " + this.phone + "\n");
	}

	public void lvlUp(int num) {
		this.age += num;
	}
}