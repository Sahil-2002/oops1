public class Dog {
    String Breed;
    int age;
    int weight;

    public void age(){
        if(age<1){
          int   Humanage  =  age * 11;
            System.out.println("dog age as human is "+Humanage);

        } else if (age>=1) {
            int Humanage =  22 + (age - 2) * 4;
            System.out.println("dog age as human is "+Humanage);

        }

    }
    public void data(){
        System.out.println("dog breed is "+Breed);
        System.out.println("dog age is "+age);
        System.out.println("dog weight is "+weight);
    }

    public static void main(String[] args) {
        Dog sc = new Dog();
        sc.Breed= "sheffard ";
        sc.age= 5;
        sc.weight = 20;
        sc.age();sc.data();
    }
}
