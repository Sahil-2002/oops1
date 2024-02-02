import java.util.Locale;

public class shirt {
    String size, colour;
    int price;

    public void discount(String size){
        this.size=size;
        double discount;
        switch(size.toLowerCase(Locale.ROOT)){
            case "s":
                discount=50.0/100.0;
                break;
            case "m":
                discount=30.0/100.0;
                break;
            case "l":
                discount=20.0/100.0;
                break;
            case "xl":
                discount=10.0/100.0;
                break;
            default:
                discount=1.0/100.0;



        }
        price =(int) (price-price*discount);
    }
    public void display(){
        System.out.println("size of shirt is "+size);
        System.out.println("colour of shirt is "+colour);
        System.out.println("discounted price of shirt is "+price);
    }

    public static void main(String[] args) {
        shirt sc = new shirt();
        sc.price=1000;
        sc.colour="red ";
        sc.discount("m");
        sc.display();
    }
}
