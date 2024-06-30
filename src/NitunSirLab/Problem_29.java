package NitunSirLab;

public class Problem_29 {
    public static void main(String[] args) {
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] oneDArray = convertTo1D(twoDArray);


        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
    }
    public static int[] convertTo1D(int[][] twoDArray) {
        int rows = twoDArray.length;
        int cols = twoDArray[0].length;
        int[] oneDArray = new int[rows * cols];

        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[k++] = twoDArray[i][j];
            }
        }

        return oneDArray;
    }
}
