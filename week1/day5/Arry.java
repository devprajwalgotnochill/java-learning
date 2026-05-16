package week1.day5;

public class Arry{
    public static void main(String[] args) {
        // Array = static / fixed size

        // empty array with size
        int[] intArry = new int[10];


        //arry with size
        // int[] intArry = {1, 2, 3, 4, 5}; 

        //normal for loop
        //to put value
        for (int i = 0; i < intArry.length; i++) {
            intArry[i] = (i+7) * 12;
        }
        

        //for loop to fetch or update the value of arry
        for (int i : intArry) {
            System.out.println(i);
        }

    }
}