import java.util.Scanner;
import java.util.Random;


public class manufactoring {

    public static void main(String[] args) {


        Scanner stdIn = new Scanner(System.in);
        int money, unitsOfLemons, unitsOfSugar, lemonCost, sugarCost, possibleCups, seed;
        int lemonPurchase, sugarPurchase, spoiled, weather, customers, cupsSold, profit;

        money = 1000;
        unitsOfLemons = 0;
        unitsOfSugar = 0;


       System.out.println("Please enter a number to randomize the game: ");
        seed = stdIn.nextInt();
        Random rand = new Random(seed);


        for (int day = 1; day <= 14; day++){
            System.out.println("Day " + day);


            System.out.println("Money: " + money);
            System.out.println("Lemons: " + unitsOfLemons);
            System.out.println("Sugar: " + unitsOfSugar + "\n");


            lemonCost = rand.nextInt(21) + 15;
            sugarCost = rand.nextInt(11) + 15;
            System.out.println("The cost of lemons is " + lemonCost);
            System.out.println("The cost of sugar is " + sugarCost);


            System.out.println("Enter the amount of lemons you would like. The cost" +
                    " is " + lemonCost + " per lemon.");
            lemonPurchase = stdIn.nextInt();
            while (money - (lemonPurchase * lemonCost) < 0 || lemonPurchase < 0) {


                System.out.println("You can't purchase this many, please choose again.");
                lemonPurchase = stdIn.nextInt();
            }


            unitsOfLemons = unitsOfLemons + lemonPurchase;
            money = money - (lemonCost * lemonPurchase);


            System.out.println("After purchasing lemons, you have " + money + " in money.");


            System.out.println("Enter the amount of sugar you would like. The cost" +
                    " is " + sugarCost + " per unit of sugar.");
            sugarPurchase = stdIn.nextInt();
            while (money - (sugarPurchase * sugarCost) < 0 || sugarPurchase < 0) {


                System.out.println("You can't purchase this much, please choose again.");
                sugarPurchase = stdIn.nextInt();
            }

            unitsOfSugar = unitsOfSugar + sugarPurchase;
            money = money - (sugarCost * sugarPurchase);


            System.out.println("After purchasing sugar, you have " + money + " in money.");



            if (unitsOfSugar <= unitsOfLemons){
                possibleCups = unitsOfSugar;
            }
            else {
                possibleCups = unitsOfLemons;
            }

            weather = rand.nextInt(4);
            switch (weather)
            {
                case 0: System.out.println("Today's weather is cool.");
                    customers = 10; break;
                case 1: System.out.println("Today's weather is average.");
                    customers = 20; break;
                case 2: System.out.println("Today's weather is warm.");
                    customers = 30; break;
                case 3: System.out.println("Today's weather is hot.");
                    customers = 40; break;
                default: customers = 0; break;
            }



            if (possibleCups <= customers){
                cupsSold = possibleCups;
                profit = 50 * cupsSold;
                money = money + profit;
            }
            else {
                cupsSold = customers;
                profit = customers * 50;
                money = money + profit;
            }



            unitsOfLemons = unitsOfLemons - cupsSold;
            unitsOfSugar = unitsOfSugar - cupsSold;



            System.out.println("Today you sold " + cupsSold + " cups of lemonade and" +
                    " made " + profit + " in money.");


            System.out.println("You have " + money + " in money after day " + day + ".");


            if (unitsOfLemons != 0){
                spoiled = (unitsOfLemons / 4);
                unitsOfLemons = unitsOfLemons - spoiled;
                System.out.println("Due to spoilage, you lost " + spoiled + " lemons." + "\n");
            }
            else {
                System.out.println("You have no lemons left, therefore no spoilage has occured." + "\n");
            }

        }


        System.out.println("After 2 weeks of sales, you have " + money + " in money remaining" +
                ", " + unitsOfLemons + " lemons remaining, and " + unitsOfSugar + " units of sugar remaining.");

    }

}