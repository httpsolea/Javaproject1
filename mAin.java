import java.util.*;
public class mAin{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mass (in kg) : ");
        float mass = sc.nextFloat();

        System.out.println("Enter the velocity (in m/s) : ");
        float velocity = sc.nextFloat();

        float kineticEnergy = (1.0f/2.0f) * mass * (velocity * velocity);

        if(kineticEnergy < 0){
            System.out.println("Kinetic Energy cannot be Negative. Please check your input values.");
        }
        else{
            System.out.println("The Kinetic Energy is "+kineticEnergy+" J.");
        }

    }

}