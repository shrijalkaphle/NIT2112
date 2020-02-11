package CLI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeNRoll {

    static List<Product> productList = new ArrayList<Product>();

    static void setData() {
        Product p1 = new Product("Schnitzel Roll",1880);
        productList.add(p1);

        //2
        Product p2 = new Product("Fish Roll",1725);
        productList.add(p2);

        //3
        Product p3 = new Product("Lamb Roll", 960);
        productList.add(p3);

        //4
        Product p4 = new Product("Ice Cream Roll", 675);
        productList.add(p4);

        //5
        Product p5 = new Product("Coffee Latte", 340);
        productList.add(p5);

        //notes and coins
        int notes[] = {5,10,20,50,100};
        int coins[] = {5,10,20,50,100,200};
        Change cng = new Change(notes,coins);
    }

    private static void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    public static void main(String[] args) {
        setData();
        int listSize = productList.size();

        Scanner scn = new Scanner(System.in);
        int input;

        //display menu
        do{
            System.out.println("======================================");
            System.out.println("______________________________________");
            for(int i=0; i<listSize;i++) {
                int required = 20;
                Product p = productList.get(i);
                String indent = "                           "; // 20 spaces
                String output = p.getName();
                output += indent.substring(0, indent.length() - output.length());
                float newPrice = (float)p.getPrice() / 100;
                System.out.printf(i+1 + ". " +output + "$%5.2f%n",newPrice);
            }
            System.out.println("6. Done");
            System.out.println("______________________________________");

            //input for menu
            System.out.print("Enter the item number you want to order : ");
            input = scn.nextInt();

            //done
            if (input == 6) {
                System.out.println("Total Amount of Sale in a Day");
                System.out.println("======================================");
                System.out.println("______________________________________");
                float overall = 0;
                String indent = "                           "; // 25 spaces
                for(int i=0; i<listSize;i++) {
                    Product p = productList.get(i);
                    String output = p.getName();
                    output += indent.substring(0, indent.length() - output.length());

                    float newPrice = (float)p.getTotal() / 100;
                    overall = overall + newPrice;
                    System.out.printf(i+1 + ". " +output + "$%5.2f%n",newPrice);
                }
                String output = "Daily Sales :";
                output += indent.substring(0, indent.length() - output.length());
                System.out.println("______________________________________");
                System.out.printf( "   " +output + "$%5.2f%n",overall);
                System.out.println("======================================");
                System.exit(0);
            }

            //get price of the selected product
            Product p = productList.get(input-1);
            int price = p.getPrice();

            //quantity of items
            System.out.print("Enter the quantity order : ");
            int qty = scn.nextInt();
            p.addToTotal(qty);
            productList.set(input-1,p);

            //display total price
            int currentTotal = price * qty;
            float totalPrice = ((float)currentTotal)/100;
            System.out.printf("Sale Price : $%.2f%n",totalPrice);

            //enter paid amount
            System.out.print("Enter the amount paid in cents [0-1000000]: ");
            int paid = scn.nextInt();

            //change to give back
            float change = (float)(paid - currentTotal)/100;
            System.out.println("Change is : $"+change);

            //returned change
            Change cng = new Change();
            cng.denChange((paid - currentTotal));
            pressAnyKeyToContinue();
        }while (input != 6);
    }


}
