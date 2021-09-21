// An Insurance company follows following rules to calculate 
// premium. 
// (1)  If a person’s health is excellent and the person is between 
// 25 and 35 years of age and lives in a city and is a male 
// then the premium is Rs. 4 per thousand and his policy 
// amount cannot exceed Rs. 2 lakhs. 
// (2)  If a person satisfies all the above conditions except that 
// the sex is female then the premium is Rs. 3 per thousand 
// and her policy amount cannot exceed Rs. 1 lakh. 
// (3)  If a person’s health is poor and the person is between 25 
// and 35 years of age and lives in a village and is a male 
// then the premium is Rs. 6 per thousand and his policy 
// cannot exceed Rs. 10,000. 
// (4)  In all other cases the person is not insured. 
// Write a program to output whether the person should be 
// insured or not, his/her premium rate and maximum amount 
// for which he/she can be insured. 

import java.util.Scanner;

public class Insuarance {
    public static void main(String args[]){
        char health,lives,gender;
        int age;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the health(P/p : Poor, E/e : Excellent)" );
        health= s.next().charAt(0);

        System.out.println("Enter the location(V/v : Village, C/c : City)" );
        lives= s.next().charAt(0);

        System.out.println("Enter the Gender(M/m : Male, F/f : Female)" );
        gender= s.next().charAt(0);

        System.out.println("Enter the age" );
        age= s.nextInt();

        if( (health=='E' || health=='e') && (age>=25 || age<=35 ) && (lives=='C'|| lives=='c') && (gender=='M'|| gender=='m')){
            System.out.println("Your premium is Rs. 4 per thousand and policy amount is Rs. 2 lakhs.");

        }
        else if((health=='E' || health=='e') && (age>=25 || age<=35 ) && (lives=='C'|| lives=='c') && (gender=='F'|| gender=='f')){
            System.out.println("Your premium is Rs. 3 per thousand and policy amount is Rs. 1 lakhs.");
        }
        else if((health=='P' || health=='p') && (age>=25 || age<=35 ) && (lives=='V'|| lives=='v') && (gender=='M'|| gender=='m')){
            System.out.println("Your premium is Rs. 6 per thousand and policy amount is Rs. 10 thousand.");
        }
        else{
            System.out.println("You are not insuared.");
        }

    }
    
}
