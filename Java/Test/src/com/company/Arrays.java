package com.company;

import java.util.Scanner;

public class Arrays {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int[] arr = new int[10];
//        arr[6] = 60;
//        System.out.println(arr[6]);
        int[] arr;
        arr = getIntegers(6);
        printArray(arr);
        System.out.println(getAverage(arr));
    }
    public static  int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values");
        int[] values = new int[number];
        for (int i =0;i<number;i++){
            values[i] = sc.nextInt();
        }
        return values;
    }
    public static void printArray(int[] arr){
        for (int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static double getAverage(int[] arr){
        int sum = 0;
        for(int i=0; i< arr.length;i++){
            sum +=arr[i];
        }
        return ((double)sum/arr.length +1);
    }

}
