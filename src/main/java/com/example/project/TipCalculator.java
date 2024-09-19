package com.example.project;

import java.math.RoundingMode;
import java.text.DecimalFormat;
// I learned how to round with https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/

public class TipCalculator {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    // I learned how to round with https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        double percentasDecimal = (double)percent/100.0;
        double tip = percentasDecimal * cost;
        double newCost = tip + cost;
        double individualCost = (cost/people);
        double individualTip = (tip/people);
        double totalPersonCost = (newCost/people);



        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + df.format(tip) + "\n");
        result.append("Total Bill with tip: $" + df.format(newCost) + "\n");
        result.append("Per person cost before tip: $" + df.format(individualCost) + "\n");
        result.append("Tip per person: $" + df.format(individualTip) + "\n");
        result.append("Total cost per person: $" + df.format(totalPersonCost) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
