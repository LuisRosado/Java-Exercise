package com.mycompany.excercise3;

import java.util.Arrays;

/**
 *
 * @author Luis
 */
public class Excercise3 {

    public static void main(String[] args) {
        double total = 0.0;
        double tax = 0.2;

        System.out.println("Welcom to duke shop!!!");

        Customer c1 = new Customer("Pinky", 14);
        
        System.out.println("Min Price: " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "S");
        Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-shirt", 10.5, "S");

        Clothing[] items = {item1, item2, item3, item4};
        
        c1.addItems(items);
        
        System.out.println("Customer is " + c1.getName() + " , Size: " + c1.getSize() + " , Total: $" + c1.getTotalClothingCost());
        
        for (Clothing item : c1.getItems()) {
            //System.out.println("Items: " + item.getDescription());
            System.out.println("Items output: " + item);
        }
        
        int average = 0;
        int count = 0;
        
        for (Clothing item : c1.getItems()) {
            if(item.getSize().equals("L")){
            count++;
            average += item.getPrice();
            }
        }
        try{
        average /= count;
        System.out.println("Average price: " + average + ", Count: " + count);
        }catch(ArithmeticException e){
            System.out.println("Sont divide by 0");
        }
        
        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            //System.out.println("Items: " + item.getDescription());
            System.out.println("Items output: " + item);
        }

    }
}
