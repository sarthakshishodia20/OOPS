public class Oops {
    public static void main(String[] args) {
        // Pen obj=new Pen();
        // obj.setColor("black");
        // obj.setTip(32);
        // System.out.println(obj.color);
        // System.out.println(obj.tip);





        // BankAccount Obj=new BankAccount();
        // Obj.setPassword("12345");
        // Obj.username="Sarthak";
        // System.out.println(Obj.username);
        // System.out.println(Obj.getPassword());

        // Student s1=new Student();
        // Student s2=new Student("ShraddhA");
        // Student s3=new Student(12345);



        Teacher t1=new Teacher();
        t1.name="abhay";
        t1.rollno="222";
        t1.password="asdf";
        t1.marks[0]=100;
        t1.marks[1]=90;
        t1.marks[2]=80;
        Teacher t2=new Teacher(t1);
        t2.password="abc";
        for(int i=0;i<3;i++){
            System.out.println(t2.marks[i]);
        }


    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class BankAccount{
   public  String username;
   private  String Password;
   public void setPassword(String pwd){
    Password=pwd;
   }
   public String getPassword(){
    return Password;
   }
}
class Student{
    public char[][] marks;
    String name;
    int roll;
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}

// copy constructor 
class Teacher{
    String name;
    String rollno;
    String password;
    int[] marks;
    Teacher(){
        marks= new int[3];
    }
    // copy constructor hai ye
    Teacher(Teacher t1){
        this.name=t1.name;
        this.rollno=t1.rollno;
        marks=new int[3];
        this.marks=t1.marks;
        
    }
    // deep copy 
    // Teacher(Teacher t1){
    //     this.name=t1.name;
    //     this.rollno=t1.rollno;
    //     marks=new int[3] ;
    //     for(int i=0;i<3;i++){
    //         this.marks[i]=t1.marks[i];
    //     }
    // }
}