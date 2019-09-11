import java.util.Scanner;
public class PizzaCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int topp;
        double basecost=2.25,totalcost,toppcost,sizecost,size;
        System.out.println("Welcome To Matej's Mega Pizza");
        System.out.print("What Size Pizza Would You Like (inches)? --> ");
        size=s.nextInt();
        System.out.print("How Many Toppings Would You Like? --> ");
        topp=s.nextInt();
        toppcost = topp*0.75;
        sizecost = size*0.5;
        totalcost = basecost+toppcost+sizecost;
        System.out.format("Your Pizza Will Cost $%.2f \n",totalcost);
    }
    
}
