// 6. Create a class Movie with private data members as movie_id, movie_name, theatre_name, ticket_charges, .
//  Write getter and setter methods.
// Write a method to calculate the total ticket charges.
// Total Charges is computed as (No_of_members * ticket_charges) + taxes. 
// Tax is 20% of the total amount.

// Method 2 : 
// No returning datatype ,with parameter as No_of_members
// Method Name : Calculate_Charge2
// Create one object of this class and invoke all the methods.

import java.util.Scanner;
class movie1{
    private int movie_id;
    private String movie_name;
    private String theatre_name;
    private int ticket_charges;
    //private int no_of_members;
    

    void Calculate_charge(int no_of_members){
        int totalbill;
        double tax;
        double netbill;
        totalbill= ticket_charges * no_of_members;
        tax= totalbill*0.2;
        netbill=totalbill+tax;
        System.out.println("Your total bill is - " + netbill);

    }


    public String get_theatre_name() {
        return theatre_name;
    }


    public void set_theatre_name(String tn) {
        theatre_name = tn;
    }


    public String get_movie_name() {
        return movie_name;
    }


    public void set_movie_name(String mn) {
        movie_name = mn;
    }


    public int get_movie_id() {
        return movie_id;
    }


    public void set_movie_id(int id) {
        movie_id =id;
    }

     public int get_ticket_charges() {
         return ticket_charges;
     }


     public void set_ticket_charges(int tc) {
         ticket_charges = tc;
     }

    // public int getno_of_members() {
    //     return ticket_charges;
    // }


    // public void setno_of_members(int no_of_members) {
    //     this.no_of_members = no_of_members;
    // }



    
}

class q6{

    public static void main(String args[]){
        movie1 m1= new movie1();
        Scanner s= new Scanner(System.in);

        System.out.println("Enter you id- ");
        int a= s.nextInt();
        m1.set_movie_id(a);

        System.out.println("Enter movie name- ");
        String n= s.next();
        m1.set_movie_name(n);

        
        System.out.println("Enter theatre name- ");
        String t= s.next();
        m1.set_theatre_name(t);

        System.out.println("Enter total members- ");
        int m= s.nextInt();
        //m1.setno_of_members(m);

       m1.set_ticket_charges(400);
        m1.Calculate_charge(m);

        
    }
}