package week1.day3;

public class logicalOperator {
    public static void main(String[] args) {
        /*
            AND (&&)
            OR (||)
            NOT (!)
            == //to compare the value 
         */
        // and
        int a = 10, b = 5;
        if (a > 5 && b < 10) {
            System.out.println("Both conditions are true");
        }
        //or 
        if (a > 5 || b < 10) {
            System.out.println("At least one condition is true");
        }
        //!= not equal to opposit of equal to 
        if ((a > 5 && b < 10)!= false) {
            System.out.println("Both conditions are true");
        }
    }
}
