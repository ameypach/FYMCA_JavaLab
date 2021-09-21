// A certain grade of steel is graded according to the following 
// conditions: 
// (i)  Hardness must be greater than 50 
// (ii)  Carbon content must be less than 0.7 
// (iii) Tensile strength must be greater than 5600 
// The grades are as follows: 
// Grade is 10 if all three conditions are met 
// Grade is 9 if conditions (i) and (ii) are met 
// Grade is 8 if conditions (ii) and (iii) are met 
// Grade is 7 if conditions (i) and (iii) are met 
// Grade is 6 if only one condition is met 
// Grade is 5 if none of the conditions are met 
// Write a program, which will require the user to give values of 
// hardness, carbon content and tensile strength of the steel 
// under consideration and output the grade of the steel.

import java.util.Scanner; 
public class grade {
    public static void main(String args[]){
        int hard,tense;
        float carbon;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of hardness");
        hard=s.nextInt();

        System.out.println("Enter the carbon content");
        carbon=s.nextFloat();

        System.out.println("Enter the tensile strength of the steel");
        tense=s.nextInt();

        if( (hard>50) && (carbon<0.7) && (tense> 5600)){
            System.out.println("Steel Grade is 10.");
        }
        else if( (hard>50) && (carbon<0.7) ){
            System.out.println("Steel Grade is 9.");
        }
         else if( (carbon<0.7) && (tense> 5600)){
            System.out.println("Steel Grade is 8.");
        }
        else if( (hard>50) && (tense> 5600)){
            System.out.println("Steel Grade is 7.");
        }
        else if( (hard>50) || (carbon<0.7) || (tense> 5600)){
            System.out.println("Steel Grade is 6.");
        }
        else{
            System.out.println("Steel Grade is 5.");
        }


    }
    
}
