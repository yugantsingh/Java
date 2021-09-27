package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static MobilePhone mobile = new MobilePhone();
    public static void main(String[] args) {
        mobile.addContact("Ramesh",97890);
        mobile.printContactList();
    }

//  Grocery List Main Class Code
//    private static com.company.groceryList groceryList =  new groceryList();
//
//    public static void main(String[] args) {
//        boolean quit = false;
//        int choice;
//        printInstructions();
//        while (!quit){
//            System.out.println("Enter your choice");
//            choice = sc.nextInt();
//            sc.nextLine();
//            switch (choice) {
//                case 0 -> printInstructions();
//                case 1 -> printList();
//                case 2 -> addItem();
//                case 3 -> modifyItem();
//                case 4 -> removeItem();
//                case 5 -> searchItem();
//                case 6 -> quit = true;
//            }
//        }
//
//    }
//    public static void printInstructions(){
//        System.out.println("\nPress ");
//        System.out.println("\t 0 - To print choice options.");
//        System.out.println("\t 1 - To print the list of grocery items.");
//        System.out.println("\t 2 - To add an item to the list.");
//        System.out.println("\t 3 - To modify an item in the list.");
//        System.out.println("\t 4 - To remove an item from the list.");
//        System.out.println("\t 5 - To search for am item in the list.");
//        System.out.println("\t 6 - To quit the application.");
//    }
//    public static void addItem(){
//        System.out.print("Please Enter the grocery item :");
//        groceryList.addGroceryItem(sc.nextLine());
//    }
//    public static void modifyItem(){
//        System.out.print("Enter the Item number: ");
//        int position = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Enter replacement Item: ");
//        groceryList.modifyGroceryItem(position-1, sc.nextLine());
//    }
//    public static void printList(){
//        groceryList.printGroceryList();
//    }
//    public static void removeItem(){
//        System.out.print("Enter the item number to be removed: ");
//        groceryList.removeItem(sc.nextInt());
//        sc.nextLine();
//    }
//    public static void searchItem(){
//        System.out.print("Enter item to be searched: ");
//        if (groceryList.findItem(sc.nextLine())!= null){
//            System.out.println("Item Found");
//        }
//        else
//            System.out.println("Item not found");
//    }
}
