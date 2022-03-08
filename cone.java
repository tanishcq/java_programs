class Cone {
	public static void main(String arg[]) {
		double h = 5.0;
		double r = 2.5;
		double l = 3.0;
		double v = (1.0/3.0) * 3.14 * r * r * h;
		double csa = 3.14 * r * l;
		System.out.println("Volume of cone : " + v);
		System.out.print("CSA of cone : " + csa);
	}
}
