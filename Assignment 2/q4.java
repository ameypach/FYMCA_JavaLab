import java.util.Scanner;

// 4. Create a class Flight with private data members  as flight_id, name, number of seats
// source and destination. 
// Create 2 objects and assign values to these objects and then print them. Write getter and setter methods.

class flight1{
    private int flight_id;
    private int seats;
    private String name;
    private String source;
    private String destination;

    public void set_flight_id(int fid){
        flight_id=fid;
    }
    
    public void set_name(String n){
        name=n;
    }
    
    public void set_seats(int st){
        seats=st;
    }
    
    public void set_source(String sour){
        source=sour;
    }
    public void set_destination(String d){
        destination=d;
    }

    public int get_flight_id(){
        return flight_id;
    }
    public String get_name(){
        return name;
    }
    public int get_seats(){
        return seats;
    }
    public String get_source(){
        return source;
    }
    public String get_destination(){
        return destination;
    }

}
class q4{
    public static void main (String args[]){
        flight1 f1= new flight1();
        //flight f2= new flight();

        Scanner s=new Scanner(System.in);

        System.out.println("Enter your name ");
        String n=s.next();
        f1.set_name(n);

        System.out.println("Enter your flight id ");
        int fid=s.nextInt();
        f1.set_flight_id(fid);

        System.out.println("Enter seats ");
        int st=s.nextInt();
        f1.set_seats(st);

        System.out.println("Enter your Source ");
        String sour=s.next();
        f1.set_source(sour);

        System.out.println("Enter your Destination ");
        String d=s.next();
        f1.set_destination(d);


        // f1.set_flight_id(01);
        // f1.set_name("Amey Pachpande");
        // f1.set_seats(100);
        // f1.set_source("Pune");
        // f1.set_destination("Delhi");

        System.out.println("Passenger " + f1.get_name() +" is going from Air india flight "+ f1.get_flight_id()+" "+ f1.get_seats() +" from "+ f1.get_source()+" to "+ f1.get_destination());

    }
}