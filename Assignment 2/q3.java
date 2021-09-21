import java.util.Scanner;

// 1. Create a class Student with private data members as student_id, name, phone,
// email id. Create 2 objects and assign values to these objects and then print them. Write getter and setter methods.


class student3{
    private int id;
    private String name;
    private String phone;
    private String email;

    public void set_id(int sid){
        id=sid;
    }
    
    public void set_name(String n){
        name=n;
    }
    
    public void set_phone(String p){
        phone=p;
    }
    
    public void set_email(String e){
        email=e;
    }

    public int get_id(){
        return id;
    }
    public String get_name(){
        return name;
    }
    public String get_phone(){
        return phone;
    }
    public String get_email(){
        return email;
    }

}
class q3{
    public static void main (String args[]){
        student3 s1= new student3();
        
        Scanner s=new Scanner(System.in);

        System.out.println("Enter your ID ");
        int sid=s.nextInt();
        s1.set_id(sid);

        System.out.println("Enter your name ");
        String n=s.next();
        s1.set_name(n);

        System.out.println("Enter your phone no");
        String p=s.next();
        s1.set_phone(p);

        System.out.println("Enter your Email id ");
        String e=s.next();
        s1.set_email(e);
        
        System.out.println("Name- " + s1.get_name());
        System.out.println("ID- " + s1.get_id());
        System.out.println("Phone- " + s1.get_phone());
        System.out.println("email- " + s1.get_email());
        


    }
}