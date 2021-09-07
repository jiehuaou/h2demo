package com.example.h2demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>(Arrays.asList("abc", "hello"));
        mylist.forEach(System.out::println);

        LinkedList<String> mylink = new LinkedList<>(Arrays.asList("abc", "hello"));
        mylink.forEach(System.out::println);

    }
}
