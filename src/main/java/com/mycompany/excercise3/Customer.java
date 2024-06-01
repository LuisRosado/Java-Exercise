package com.mycompany.excercise3;

/**
 *
 * @author Luis
 */

public class Customer {

    private String name;
    private String Size;
    private Clothing[] items;

    public Customer(String name, int mesurement) {
        this.name = name;
        setSize(mesurement);
    }

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }
    
    public double getTotalClothingCost(){
        double total = 0;
        for (Clothing item: items) {
                total = total + item.getPrice();
                //System.out.println("Item : " + item.getDescription() + " ,$" + item.getPrice() + " , " + item.getSize());
               // total = total + (total * tax);
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public void setSize(int mesurement) {
        switch (mesurement) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }

}
