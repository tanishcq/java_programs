public class staticDemonstration {
    static int a = 1;
    static int b;
    static int c;

    static {
        b = 2*a;
        System.out.println("this is a static block. // *Note: it is executed before main()");
    }

    static int getC() {
        c = 2*b;
        return c;
    }

    public static void main(String args[]) {
        System.out.println("this is main()");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println("Value of c : " + getC());
    }
}
