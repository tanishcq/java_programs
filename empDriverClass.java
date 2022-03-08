import java.util.Scanner;

class employee {
	String emp_name;
	int age;
	double basic_pay;
	double gross_salary;
	void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Employee Name : ");
		emp_name = in.nextLine();
		System.out.print("Age : ");
		age = in.nextInt();
		System.out.print("Salary : ");
		basic_pay = in.nextDouble();
		in.close();
	}
	void calculate() {
		gross_salary = basic_pay + 0.3*basic_pay + 1.2*basic_pay;
	}
	void output() {
		System.out.println("Name : " + emp_name);
		System.out.println("Age : " + age);
		System.out.print("Gross Salary : " + gross_salary);
	}
}

class empMain {
	public static void main(String args[]) {
		employee r = new employee();
		r.input();
		r.calculate();
		r.output();
	}
}