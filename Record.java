import java.util.Scanner;
public class Record {

	Kursant kurs;
	Instructor inst;
	Manager manag;
	String time;
	Car cr;

	public Record(){
		this.kurs = new Kursant();
		this.inst = new Instructor();
		this.manag = new Manager();
		this.time = "not empty";
		this.cr = new Car();
	}

	public Record(Kursant kurs, Instructor inst, Manager manag, String time, Car cr){
		this.kurs = kurs;
		this.inst = inst;
		this.manag = manag;
		this.time = time;
		this.cr = cr;
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		this.kurs.input();
		this.inst.input();
		this.manag.input();
		System.out.print("Your time: ");
		this.time = scanner.nextLine();
		this.cr.input();
	}

	public void printAll(){
		System.out.print("Record: \n");
		this.kurs.printAll();
		this.inst.printAll();
		this.manag.printAll();
		System.out.print("Time: " + this.time + "\n");
		this.cr.printAll();
	}

}