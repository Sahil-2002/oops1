public class Tv {
    String Brand;
    int size, price;

    public void discount(){
        if(size>=20&& size<=50){
            int discount = 500;
            System.out.println("for the size "+size +" inch the discount is of RS "+discount);
            price = price - discount;
        } else if (size>=50) {
            int discount =2000;
            System.out.println("for the size "+size +"the discount is of RS "+discount);

            price = price - discount;
        }
    }
    public void display(){
        System.out.println("Brand of tv is "+Brand);
        System.out.println("size of tv is "+size);
        System.out.println("discounted price of tv is "+price);
    }

    public static void main(String[] args) {
        Tv sc = new Tv();
        sc.Brand="Samsung";
        sc.size=37;
        sc.price=50000;
        sc.discount();
        sc.display();


    }
}
