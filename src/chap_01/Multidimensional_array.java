package chap_01;

public class Multidimensional_array {
    public static void main(String[] args) {
        int [][] myNumbers = {{1,2,3,4}, {5,6,7}};
        // Access Elements
//        System.out.println(myNumbers[1][2]);

        // Loop through a multi-dimensional array
//        for (int i = 0; i < myNumbers.length; i++){
//            for (int j = 0; j < myNumbers[i].length; j++){
//                System.out.println(myNumbers[i][j]);
//            }
//        }

        // Using for-each loop
        for (int[] row : myNumbers){
            for (int i : row){
                System.out.println(i);
            }
        }
    }
}
