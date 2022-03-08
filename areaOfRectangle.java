import java.util.Scanner;

class rectangle {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Length : ");
		int l = in.nextInt();
		System.out.print("Bredth : ");
		int b = in.nextInt();
		int area  = l*b;
		System.out.print("Area of Rectangle : " + area);
		in.close();
	}
}