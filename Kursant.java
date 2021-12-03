import java.util.InputMismatchException;
import java.util.Scanner;
public class Kursant {
	static int count = 0;
	String fio = "123";
	int age = -1;
	String phone = "123";
	String email = "123";
	String category = "123";

	public Kursant(){
		count++;
	}

	public Kursant(String fio, int age, String phone, String email, String category){
		this.fio = fio;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.category = category;
		count++;
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ваше имя: ");
		this.fio = scanner.nextLine();
		System.out.print("Your age: ");
		try {
			this.age = scanner.nextInt();
		} catch (InputMismatchException e){
			this.age = -1;
			System.out.print("Ошибка ввода\n");
		}
		
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
		System.out.print("Name: " + this.fio + ", Age: " + this.age + ", Phone: " + this.phone 
			+ ", Email: " + this.email + ", Category: " + category + "\n");
	}

	public void lvlUp(int num) {
		this.age += num;
	}

	static public void print_count(){
		System.out.print("Кол-во студентов: " + count + "\n");
	}
}