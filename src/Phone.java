import java.util.Scanner;

public class Phone {
    String make, model;
    int storage;

    public void getdeta() {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the maker of phone : ");
        make = sc.next();
        System.out.println("enter the model of phone : ");
        model = sc.next();
        System.out.println("enter the storage of phone : ");
        storage = sc.nextInt();


    }

    public void price() {
        if (make.equals("Android") && model.equals("note-series")) {
            if (storage == 64) {
                int price = 20000;
                System.out.println("price of phone is " + price);
            } else if (storage == 128) {
                int price = 40000;
                System.out.println("price of phone is " + price);
            }
        } else if (make.equals("Android") && model.equals("galaxy")) {
            if (storage == 64) {
                int price = 40000;
                System.out.println("price of phone is " + price);
            } else if (storage == 128) {
                int price = 50000;
                System.out.println("price of phone is " + price);
            }
        } else if (make.equals("ios") && model.equals("pro")) {
            if (storage == 64) {
                int price = 80000;
                System.out.println("price of phone is " + price);
            } else if (storage == 128) {
                int price = 100000;
                System.out.println("price of phone is " + price);
            }
        }
    }

    public void display(){
        System.out.println("maker of phone is "+make);
        System.out.println("model of phone is "+model);
        System.out.println("storage of phone is "+storage);
    }

    public static void main(String[] args) {
        Phone sc = new Phone();
        sc.getdeta();
        sc.price();
        sc.display();
    }
}
