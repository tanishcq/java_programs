import java.util.Scanner;

class student {
	String stu_name;
	long enrol;
	long mobile;
	double percentage;
	String division;
	
	void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Student Name : ");
		stu_name = in.nextLine();
		System.out.print("enrol no. : ");
		enrol = in.nextLong();
		System.out.print("Mobile : ");
		mobile = in.nextLong();
		System.out.print("Percentage : ");
		percentage = in.nextDouble();
		in.close();
	}
	void calculate() {
		if(percentage > 60) {
			division = "1";
		} else if(percentage <=60 && percentage > 50) {
			division = "2";
		}
		else {
			division = "3";
		}
	}
	void output() {
		System.out.println("Name : " + stu_name);
		System.out.println("Enrol : " + enrol);
		System.out.print("Mobile : " + mobile);
		System.out.print("Division : " + division);
	}
}

class studentMain {
	public static void main(String args[]) {
		student s = new student();
		s.input();
		s.calculate();
		s.output();
	}
}