// 2. Create a class Patient with data members as patient_id, 
// patient_name, phone_number, email_id, days_admitted, charges_per_day.
// Write a method to calculate the total bill of the patient.
// Total Bill is computed as (days_admitted * charges_per_day) + taxes. 
// Tax is 10% of the total amount.
// Method 2 : 
// No returning datatype ,with parameter  as days_admitted and charges
// Method Name : Calculate_Bill2
// Create one object of this class and invoke all the methods.

import java.util.Scanner;
class patient2{
    int patient_id;
    String patient_name;
    String phone_number;
    String emailid;
    //double days_admitted;
    //int charges_per_day;

    void Calculate_Bill(int days_admitted, int charges_per_day){
        double totalbill;
        double tax;
        double netbill;
        totalbill= days_admitted * charges_per_day;
        tax= totalbill*0.1;
        netbill=totalbill+tax;
        System.out.println("Your total bill is - " + netbill);

    }
    
}

class q2{

    public static void main(String args[]){
        int days;
        int charges;

        patient2 p1= new patient2();
        Scanner s= new Scanner(System.in);
         System.out.println("Enter your patient ID ");
         p1.patient_id=s.nextInt();

         System.out.println("Enter your name");
         p1.patient_name=s.next();

         System.out.println("Enter your phone no");
         p1.phone_number=s.next();

         System.out.println("Enter email id");
         p1.emailid=s.next();

        System.out.println("Enter the days admitted");
        days=s.nextInt();
        charges=100;

        System.out.println("ID- " + p1.patient_id);
        System.out.println("Name- " + p1.patient_name);
        System.out.println("Phone number- " + p1.phone_number ) ;
        System.out.println("Email- " + p1.emailid);
        p1.Calculate_Bill(days,charges);
        
    }
}