package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

/* WYRAŻENIE LAMBDA*/

//        JButton btn = new JButton("Ok");
//        btn.addActionListener(actionEvent->System.out.println("Click"));    //wyrażenie lambda

//        FuncInterface func = new FuncInterface() {
//            @Override
//            public void method() {
//                System.out.println("Tralala");
//                System.out.println("Drugie tralala");
//            }
//        };
//        func.method();
//
//        FuncInterface lambda = ()->{
//            System.out.println("Tralala");
//            System.out.println("Drugie tralala");
//        };
//        lambda.method();

       /*Programowanie strumieniowe*/

        List<String> names = Arrays.asList("Janek", "Ala", "Kuba", "Kasia");
        List<String> filtered = new ArrayList<>();

        for(String name: names){
            if (name.startsWith("K")){
                filtered.add(name.toUpperCase());
            }
        }
        System.out.println(filtered);

        List<String> filtered2 = names
                .stream()
                .filter(
                        name->name.startsWith("K"))
//                .map(                                         //pierwsza metoda na upperCase
//                        name->name.toUpperCase())
                .map(String::toUpperCase)                       //druga metoda
                .collect(Collectors.toList());

        System.out.println(filtered2);

        /* Interfejsy funkcyjne */



    }
}
