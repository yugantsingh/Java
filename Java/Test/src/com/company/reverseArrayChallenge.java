package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArrayChallenge {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("Enter the value of Count");
        count = sc.nextInt();
        int[] arr = readIntegers(count);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse(arr)));

    }

//    Method 1: Uses arr.length to swap elements in reverse

//    public static int[] reverse(int[] arr){
//        int[] arrReverse = new int[arr.length];
//        for(int i=0; i<arr.length;i++){
//            arrReverse[arr.length-1-i] = arr[i];
//        }
//        return arrReverse;
//    }

//    Method 2 : Uses half the length of array method to reverse the array
    public static int[] reverse(int[]arr){
        int maxIndex = arr.length-1;
        int halfLength = arr.length/2;
        for(int i=0; i<halfLength;i++){
            int temp = arr[i];
            arr[i] = arr[maxIndex-i];
            arr[maxIndex-i] = temp;
        }
        return arr;
    }

    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        System.out.println("Enter Array Elements");
        for (int i=0;i<count;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
