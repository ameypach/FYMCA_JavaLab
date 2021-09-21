// 2. Create a class Flight with private data members  as flight_id, name, number of seats
// source and destination. 
// Create 2 objects and assign values to these objects and then print them. Write getter and setter methods.

class flight{
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
    
    public void set_seats(int s){
        seats=s;
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
class q2{
    public static void main (String args[]){
        flight f1= new flight();
        flight f2= new flight();

        f1.set_flight_id(01);
        f1.set_name("Amey Pachpande");
        f1.set_seats(100);
        f1.set_source("Pune");
        f1.set_destination("Delhi");

        
        f2.set_flight_id(02);
        f2.set_name("aaryan Pachpande");
        f2.set_seats(100);
        f2.set_source("Mumbai");
        f2.set_destination("Delhi");
        
        // System.out.println( s1.id +" "+ s1.name +" "+ s1.phone +" "+ s1.email);
        // System.out.println( s2.id +" "+ s2.name +" "+ s2.phone +" "+ s2.email);
        System.out.println("Passenger " + f1.get_name() +" is going from Air india flight "+ f1.get_flight_id()+" "+ f1.get_seats() +" from "+ f1.get_source()+" to "+ f1.get_destination());
        System.out.println("Passenger " + f2.get_name() +" is going from Air india flight "+ f2.get_flight_id()+" "+ f2.get_seats() +" from "+ f2.get_source()+" to "+ f2.get_destination());
        //System.out.println(f2.get_name()+" "+ f2.get_flight_id()+" "+ f2.get_seats() +" "+ f2.get_source()+" "+ f2.get_destination());



    }
}