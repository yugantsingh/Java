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
//        Method 1
        int temp;
        for(int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

//        Method 2
//        boolean flag = true;
//        int temp;
//        while (flag){
//            flag = false;
//            for (int i=0;i< arr.length-1;i++){
//                if (arr[i]<arr[i+1]){
//                    temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                    flag =true;
//                }
//            }
//        }
        return arr;
    }
}
