import java.util.Scanner;

public class KM_TO_MILES {
    public static void main(String[] args) {
        System.out.println("Enter value in KiloMeters -");
        Scanner sc = new Scanner(System.in);
        float kms = sc.nextFloat();
        float miles = kms* 0.621f;
        System.out.println(kms+" km in miles are "+miles+" miles");
    }
}
