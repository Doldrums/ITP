package com.company;

import com.company.arina_cheverda.MyCalculator;
import com.company.arina_cheverda.MyNumberCreator;

import java.util.ArrayList;
import java.util.List;

public class NumberOperations {
    public static void main(String[] args) {
        MyNumberCreator createNumber = new MyNumberCreator();
        List<Number> listik = new ArrayList<Number>();
        listik = createNumber.generateNumbers(10);
        MyCalculator cacl = new MyCalculator(listik);
        System.out.println(cacl.summarize());
        System.out.println(cacl.multiply());
        
    }
}
