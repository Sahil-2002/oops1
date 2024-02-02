public class Furniture {
String type , material;
int price;

public void  discount(){
    int discount =0;
    if(material.equals("poor")){
        discount=300;
    } else if (material.equals("good")) {
    discount=200;

    } else if (material.equals("excellent")) {
        discount=100;

    }
    price = price - discount;

}
public void display(){
    System.out.println("the type of furniture is "+type);
    System.out.println("the material of furniture is "+material);
    System.out.println("the discounted price is "+price);
}

    public static void main(String[] args) {
        Furniture sc = new Furniture();
        sc.type="kitchen";
        sc.material="excellent";
        sc.price=2000;
        sc.discount();
        sc.display();

    }

}
