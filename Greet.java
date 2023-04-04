import  java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        System.out.println("Please Enter your name -");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+", Welcome to this world!!");
    }
}
