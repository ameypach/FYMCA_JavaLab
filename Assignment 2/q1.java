// 1. Create a class Student with private data members as student_id, name, phone,
// email id. Create 2 objects and assign values to these objects and then print them. Write getter and setter methods.


class student2{
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
class q1{
    public static void main (String args[]){
        student2 s1= new student2();
        student2 s2= new student2();
        s1.set_name("Amey");
        s1.set_id(02);
        s1.set_phone("9130465282");
        s1.set_email("ameypachgmail.com");

        s2.set_name("Aaryan");
        s2.set_id(03);
        s2.set_phone("465465282");
        s2.set_email("pach@gmail.com");

        // s1.id=01;
        // s1.name="Amey Pachpande";
        // s1.phone="9130465282";
        // s1.email="ameypach@gmail.com";

        
        // s2.id=01;
        // s2.name="Aryan Pachpande";
        // s2.phone="9130465282";
        // s2.email="ameypach@gmail.com";
        
        // System.out.println( s1.id +" "+ s1.name +" "+ s1.phone +" "+ s1.email);
        // System.out.println( s2.id +" "+ s2.name +" "+ s2.phone +" "+ s2.email);
        System.out.println(s1.get_name()+" "+ s1.get_id()+" "+ s1.get_phone() +" "+ s1.get_email());
        System.out.println(s2.get_name()+" "+ s2.get_id()+" "+ s2.get_phone() +" "+ s2.get_email());



    }
}