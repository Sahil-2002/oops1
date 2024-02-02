 class student1 {
     String name;
     int age;
     int id;

     public void display() {

         System.out.println("name of student is " + name);
         System.out.println("age of student is " + age);
         System.out.println("id of student is " + id);

     }
 }
public class student {
    public static void main(String[] args) {
        student1 sc = new student1();
     sc.name="sahil";
     sc.age=17;
     sc.id=12;
     sc.display();


    }

}


