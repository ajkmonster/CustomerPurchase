import java.util.Scanner;

public class CustomerPurchase {
    public static void main(String[] args){
        String name;
        double purchase;
        double tax;
        double salestax;
        double total;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = key.nextLine();
        Scanner key1 = new Scanner(System.in);
        System.out.print("Please enter your purchase amount: ");
        purchase = key1.nextDouble();
        Scanner key2 = new Scanner(System.in);
        System.out.print("Please enter your tax code number (0-tax exempt, 1-state sales tax only (3%), " + "\n" +
                "2-federal and state sales tax (5%), 3-special taxes (7%): ");
        tax = key2.nextInt();
        if (tax == 0){
            tax = 0;
        }
        if (tax == 1){
            tax = 0.03;
        }
        if (tax == 2){
            tax = 0.05;
        }
        if (tax ==3){
            tax = 0.07;
        }
        else {
            System.out.println("Incorrect tax code entered. Please restart.");
        }
        salestax = (tax * purchase);
        total = salestax + purchase;
        System.out.println("Name: " + name);
        System.out.println("Purchase amount:" + purchase);
        System.out.println("Sales tax: " + salestax);
        System.out.println("Total: " + total);
    }
}

   /* scanner customers name
        scanner purchase amount
        scanner tax code between (0 tax exempt, 1 state sales tax only (3%),
        2 federal and stae sales tax (5%), 3 special taxes (7%))
        if tax code equals 0
        %tax equals 0%
        if tax code equal 1
        %tax equals 3%
        if tax code equals 2
        %tax equals 5%
        if tax code equals 3
        %tax equals 7%
        else
        print error re-enter tax code
        total equals (%tax*purchase amount)+purchase amount
        print customers name
        printpurchase amount
        print sales tax
        print total
        */