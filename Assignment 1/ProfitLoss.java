// 1. If cost price and selling price of an item is input through the 
// keyboard, write a program to determine whether the seller has 
// made profit or incurred loss. Also determine how much profit 
// he made or loss he incurred. 


import java.util.Scanner;
class ProfitLoss{
    public static void main(String args[])
    {
        int cp,sp,profit;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Cost Price and Selling Price");
        cp=s.nextInt();
        sp=s.nextInt();
        profit=sp-cp;

        if (sp>cp){
        System.out.println("It is a Profit!" + "You made a profit of- Rs" + profit);
        }
        else if(sp == cp) {
            System.out.println("No profit, No loss");
        }
        else {
        System.out.println("It is a Loss!");
        }



        }
}