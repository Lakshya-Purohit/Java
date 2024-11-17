package Array;

import java.util.Scanner;

public class ArraySecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Elements");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i<n;i++)
        {
            numbers[i] = scanner.nextInt();
        }

        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int num: numbers)
        {
            if(num > firstLargestNumber){
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = num;
            } else if (num > secondLargestNumber && num!=firstLargestNumber) {
                secondLargestNumber = num;
            }
        }
        if(secondLargestNumber == Integer.MIN_VALUE)
        {
            System.out.println("There is no Second Largest Number");
        } else
        {
            System.out.println("The Second largest number out of give array is: "+secondLargestNumber);
        }
    }
}
