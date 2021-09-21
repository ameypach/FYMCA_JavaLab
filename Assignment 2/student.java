// Today's Homework
// 1. Create a class Student with data members as student_id, name, phone,
// email id. Create 2 objects and assign values to these objects and then print them


// 2. Create a class Flight with data members  as flight_id, name, number of seats
// source and destination. Create 2 objects and assign values to these objects and then print them

class student1{
    int id;
    String name;
    String phone;
    String email;
}
class student{
    public static void main (String args[]){
        student1 s1= new student1();
        student1 s2= new student1();
        s1.id=01;
        s1.name="Amey Pachpande";
        s1.phone="9130465282";
        s1.email="ameypach@gmail.com";

        
        s2.id=01;
        s2.name="Aryan Pachpande";
        s2.phone="9130465282";
        s2.email="ameypach@gmail.com";
        
        System.out.println( s1.id +" "+ s1.name +" "+ s1.phone +" "+ s1.email);
        System.out.println( s2.id +" "+ s2.name +" "+ s2.phone +" "+ s2.email);



    }
}