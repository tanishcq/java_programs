import java.util.Scanner;

class inputArray {
    int arr[], searchKey;
    double sum = 0;
    double average = 0;
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array : ");
        int n = in.nextInt();
        arr = new int[n];
        System.out.println("Enter " + n + " elements.");
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        average = sum/n;
        System.out.print("Enter an element to search in the array : ");
        searchKey = in.nextInt();
        int index = sort(arr, searchKey);
        if(index != -1) System.out.println("Element found at index : " + index);
        else System.out.println("Element was not found.");
        in.close();
    }
    
    static int sort(int[] arr, int searchKey) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("____________________________________");
        System.out.println("Sorted array is : ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("____________________________________");

        int index = -1;
        int s = 0, e = arr.length - 1;
        while(s <= e) {
            int mid = s+(e-s)/2;
            if(searchKey == arr[mid]) {
                index = mid;
                break;
            }
            else if(searchKey < arr[mid]) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return index;
    }

    void output() {
        System.out.println("____________________________________");
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
}

public class array {
    public static void main(String arr[]) {
        inputArray a = new inputArray();
        a.input();
        a.output();
    }
}