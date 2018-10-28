package com.company;

import java.sql.SQLOutput;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalMain {
    public static void  main(String[] args){
        Function<String, Integer> numberOfChars = text->text.length();

        System.out.println(numberOfChars.apply("Ala ma kota"));

        BiFunction<Integer, Integer, Integer> sumOfInts =
                (num1, num2)->num1+num2;

        System.out.println(sumOfInts.apply(10,5));

    }
}
