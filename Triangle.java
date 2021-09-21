/* Write a program to check whether a triangle is valid or not, 
when the three angles of the triangle are entered through the 
keyboard. A triangle is valid if the sum of all the three angles 
is equal to 180 degrees. */


import java.util.Scanner;

class Triangle {
    public static void main(String args[]){
    int angle1,angle2,angle3,total;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter angles");
    angle1=s.nextInt();
    angle2=s.nextInt();
    angle3=s.nextInt();
    total=angle1+angle2+angle3;

    if(total==180){
        System.out.println("Triangle is valid");
    }
    else{
        System.out.println("Triangle is not valid");
    }
    }
}
