public class Operators {
    public static void main(String[] args) {
        int a =2;
        int b =5;
        //Arithmetic operators
        int c = a + b; //you can replace + with any of -,*,/,%
        System.out.println(c);

        //Assignment operators
        a%=b; //use any of = ,+=, -=, *=, /=, %=
        System.out.println(a);

        //Comparison operators, these return boolean
        System.out.println(a>b);

        //Logical operators
        System.out.println(a>b && a<b);
        System.out.println(a>b || a<b);

        //Bitwise operators, These work on bits
        System.out.println(a&b); // this will output the AND operation on bit representation of a and b.

        

    }
}
