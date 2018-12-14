import java.util.Scanner;

public class manufactoring {
    public static void main(String[] args){

double sugarPrice= 0.05;
double lemonPrice=0.20;
double cupPrice=0.20;
double money=20.00;

double sugar=0;
double lemon=0;
double cup=0;
double day=7;

System.out.println("Welcome to the lemonade stand.");
while(day <= 7);

System.out.println("Day" + day +"Money is at" + money);
System.out.println("Your current inventory is: Lemons"+ lemon +", sugar:" + sugar+ "Cups are at:" +cup+",");
System.out.println("***********************************\n");

System.out.println("lemon cost" + lemonPrice+ "per unit: How many would you like to buy?");

Scanner in1 = new Scanner(System.in);
double boughtLemon= in1.nextDouble();
if (money - (lemonPrice*boughtLemon)>=0)
{
    lemon+= lemon+ boughtLemon;

    money= money - (lemonPrice*boughtLemon);

}
else if ((money - (lemonPrice*boughtLemon)<=0))
{

        }




    }
}
