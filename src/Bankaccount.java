import java.util.Scanner;

class Bankaccountdata {
    int balance=0;
    int accountno;
    public int getAccountno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account number : ");
        accountno= sc.nextInt();
        return accountno;


    }
    public int deposite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the deposite amount : ");
        int depo = sc.nextInt();
        balance=balance+depo;
        System.out.println("updated balance after new deposite is "+balance);
        return balance;


    }
    public int withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the withdrawal amount : ");
        int with = sc.nextInt();
        balance = balance-with;
        System.out.println("updated balance after withdraw is "+balance);
        return balance;


    }
}
public  class Bankaccount {
    public static void main(String[] args) {
        Bankaccountdata sc = new Bankaccountdata();
        sc.getAccountno();
        System.out.println("account number is " + sc.accountno);
        while (true) {

            sc.deposite();
            sc.withdraw();



        }
    }
}