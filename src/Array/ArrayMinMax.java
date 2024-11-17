package Array;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Enter element "+ i);
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for(int num :numbers){
            if(num> max) max = num;
            if(num<min) min = num;
        }

        System.out.println("Maximum Number in Array.Array:" + max);
        System.out.println("Minimum number in Array.Array:" + min);
    }
}
