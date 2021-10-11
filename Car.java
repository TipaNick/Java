import java.util.Scanner;
public class Car {

	String model;
	String num;

	public Car(){
		this.model = "not empty";
		this.num = "not empty";
	}

	public Car(String model, String num){
		this.model = model;
		this.num = num;
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your model: ");
		this.model = scanner.nextLine();
		
		System.out.print("Your num: ");
		this.num = scanner.nextLine();
	}

	public void printAll(){
		System.out.print("Model: " + this.model + ", Num: " + this.num + "\n");
	}
	
	public void changeNum(String num){
		this.num = num;
	}
}