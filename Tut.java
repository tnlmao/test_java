import java.util.Scanner;
public class Tut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks out of 100 for corresponding subjects:");
        System.out.println("Hindi -");
        int hindi = sc.nextInt();
        System.out.println("English -");
        int english = sc.nextInt();
        System.out.println("Maths -");
        int maths = sc.nextInt();
        System.out.println("Science -");
        int science = sc.nextInt();
        System.out.println("History -");

        int history = sc.nextInt();
        System.out.println("Generating your result ......................");
        float percentage = ((float)(hindi+english+maths+science+history)/5);
        System.out.println("Your percentage is ->>"+percentage);

    }
}
