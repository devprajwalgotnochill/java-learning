package week1.day3;

public class dataTypesConversion {
    public static void main(String[] args) {
        /*
            Implicit Type Conversion
            order
            byte → short → int → long → float → double 
            if the conversion follows this order its automatic
        */
        byte x = 12;

        int y = x;// ->(automatic)
        System.out.println(y);

        /*
            2. Explicit Type Conversion (Narrowing)

            Also called manual casting.

            Must be done by the programmer
            Used when converting a larger data type to a smaller one
            May cause data loss or precision loss
        */

        double num = 10.75;

        int result = (int) num;  // double → int (manual)
        System.out.println(result);  // Output: 10
        
    }
}
// imp concept used in oop 


