import java.util.Scanner;
public class Momentum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mass,vel,momentum;
        System.out.print("Enter The Mass --> ");
        mass=s.nextDouble();
        System.out.print("Enter The Velocity --> ");
        vel=s.nextDouble();
        momentum = mass*vel;
        System.out.format("The Momentum is %.2f kg*m/s\n",momentum);
    }
    
}
