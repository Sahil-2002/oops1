public class Circle {
    int r ;
public int Area(){
    int area = (int) (Math.PI*r*r);
    return area;

}
public int Circumference(){
    int Cir = (int) (2*Math.PI*r);
    return Cir;

}

    public static void main(String[] args) {
        Circle sc = new Circle();
        sc.r=100;
       int area = sc.Area();
      int Cir=  sc.Circumference();
        System.out.println("area of circle is "+area);
        System.out.println("circumference of circle is "+Cir);
    }
}
