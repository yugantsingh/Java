package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class minimumElementChallenge {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count, min;
        int[] arr ;
        System.out.println("Enter the Value of count");
        count = sc.nextInt();
        arr = readIntegers(count);
        System.out.println(Arrays.toString(arr));
        min = findMin(arr);
        System.out.println(min);

    }

    private static int findMin(int[] arr) {
//        int min = arr[0];
        int min = Integer.MAX_VALUE;
        for (int i=1; i< arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }


    //Methods
    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        System.out.println("Enter Array Elements");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}
