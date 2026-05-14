package week1.day4;

public class conditionOperators 
{
    public static void main(String[] args) 
    {
        
        int x = 100;
        int y = 200;
        int z = 300;
        boolean isEven;

        if (x < y){
            System.out.println("True");
        } else{
            System.out.println("NO");
        }

        if(x > y && x > z){
            System.out.println("Is greater :" + x);
        } else if (y>z) {
            System.out.println("Is greater :"+y);
        }else{
            System.out.println("Is greater :"+z);
        }

        // ternary operator
        isEven = x % 2== 0 ? true :false;  
        System.out.println(isEven);
    }
}
