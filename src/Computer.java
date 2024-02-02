public class Computer {
    String processor;
    int RAM, storage;

    public void price(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
        int processor_price = 0;
        int hardware = 5000;
        RAM = RAM * 100;
        storage = storage * 100;
        switch (processor) {

            case "i3":
                processor_price = 500;
                break;
            case "i5":
                processor_price = 1000;
                break;
            default:
                processor_price=2000;


        }
        int price = hardware + processor_price + RAM + storage;
        System.out.println("total price of computer is " + price);
    }



    public void display(){
        System.out.println("the computer processor is "+processor);
        System.out.println("RAM of the system is "+RAM);
        System.out.println("storage capacity of system is "+storage);

    }

    public static void main(String[] args) {
        Computer sc = new Computer();

        sc.price("i5",8,128 );
        sc.display();

    }

}
