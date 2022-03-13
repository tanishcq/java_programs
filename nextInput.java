import java.util.Scanner;

public class nextInput {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sum = 0, average, count = 0;
        System.out.println("Enter the integers to find sum and average...");
        while(in.hasNextInt()) {
            int curr = in.nextInt();
            sum += curr;
            count++;
        }
        average = sum/count;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        in.close();
    }
}
