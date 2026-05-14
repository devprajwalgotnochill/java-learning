package week1.day3;

public class logicalOperator {
    public static void main(String[] args) {
        /*
            AND (&&) 1 1 = 1
            OR (||)  1 0 = 1
            NOT (!)  0 = 1  
            == //to compare the value 
         */
        // and
        int a = 10, b = 5;


        System.out.println(a > 5 && b < 10);
        //or 
        System.out.println(a > 5 || b < 10);
      
       
        //!= not equal to opposit of equal to 
        System.out.println((a > 5 && b < 10)!= false);
    }
}
