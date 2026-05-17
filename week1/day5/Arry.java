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
        // enhanced for loop
        // for (int i : intArry) {
            
        // }

        // multi dimentional arry 
        int[][] multiArry = new int[3][3]; 
        // [0][0]; = 1strow 1stcoumn

        int randomNum;
        // using for loop
        for (int i = 0; i< multiArry.length; i++){

            for (int j = 0; j< multiArry[i].length; j++){

                //type casting 
                randomNum = (int)(Math.random() *10);
                multiArry[i][j] = randomNum;

                // multiArry[i][j] = x;
                // x++;
            }

        }

        // enhanced for loop
        for (int[] row : multiArry) {

            for (int num : row) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
        // 

    }
}