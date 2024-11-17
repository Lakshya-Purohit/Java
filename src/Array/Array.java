package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of elements");
        int n = scanner.nextInt();

        int[] numbers = new int[n];


        for (int i = 0; i<n; i++){
            System.out.println("Enter "+ i+" Element:");
            numbers[i] = scanner.nextInt();
        }

        for(int num : numbers){
            System.out.println("Element: " + num);
        }

        scanner.close();
     }
}
