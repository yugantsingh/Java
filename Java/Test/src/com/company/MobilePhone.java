package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactList = new ArrayList<>();
    public void printContactList(){
        System.out.println("Here");
        for(Contacts j : contactList){
            System.out.println(j.getName());
            System.out.println(j.getNumber());
        }
    }
    public void addContact(String name ,int number){
        System.out.println("Adding");
        Contacts cons = new Contacts(name,number);
        contactList.add(cons);
    }
}
