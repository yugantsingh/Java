package com.company;

import java.util.ArrayList;

public class groceryList {
    private final ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("We have "+ groceryList.size() +" items in list");
        for (int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position, newItem);
    }
    public void removeItem(int position){
        groceryList.remove(position-1);
    }
    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            return groceryList.get(position);
        }
        return null;
//        return searchItem;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
//    public void main(String[] args) {
//        String item;
//        System.out.println("Enter Elements in the grocery list");
//        for (int i=0; i<5;i++){
//            item = sc.nextLine();
//            addGroceryItem(item);
//        }
//        printGroceryList();
//    }
}
