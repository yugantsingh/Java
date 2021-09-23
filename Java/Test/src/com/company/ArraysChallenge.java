package com.company;

import java.util.Scanner;

public class ArraysChallenge {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number =5;
        int[]arr;
        arr = getIntegers(number);
        arr = sortArray(arr);
        printArray(arr);
    }
    public static int[] getIntegers(int number){
        int[] arr = new int[number];
        for(int i=0;i<number;i++){
            arr[i] =sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static int[] sortArray(int[] arr){
        int temp = 0;
        for(int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
