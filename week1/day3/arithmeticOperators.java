package week1.day3;

public class arithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1 //reminder

        int result;

        result = a + b;
        System.out.println(result);

        result += 10;
        System.out.println(result);

        /*
        it behave diff when we try to fetch the value 
        n++ != ++n 

        n++ post-increment
        ++n pre-increment
        */
        int n = 10;

        int x = ++n; // n becomes 11, then assigned
        int y = n++; // b gets 11, then n becomes 12

        System.out.println(x); // 11
        System.out.println(y); // 11
        System.out.println(n); // 12
    }
}
