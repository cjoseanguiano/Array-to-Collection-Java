package com.devix.www;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many elements you want to add to the array: ");
        int n = Integer.parseInt(bufferedReader.readLine());

        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            name[i] = bufferedReader.readLine();
        }
        List<String> list = Arrays.asList(name);
        System.out.println();

        for (String li : list) {
            String str = li;
            System.out.println(str + "");
        }
    }
}
