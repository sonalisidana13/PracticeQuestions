// Java program for Pascal’s Triangle Using Dynamic
// Programming in O(n^2) time and O(n^2) extra space

import java.util.*;

class PascalTriangle {

    static List<List<Integer>> printPascal(int n) {

        // An auxiliary array to store
        // generated pascal triangle values
        List<List<Integer>> mat = new ArrayList<>();

        // Iterate through every line and
        // print integer(s) in it
        for (int row = 0; row < n; row++) {

            // Every line has number of integers
            // equal to line number
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i <= row; i++) {

                // First and last values in every row are 1
                if (row == i || i == 0)
                    arr.add(1);

                    // Other values are sum of values just
                    // above and left of above
                else
                    arr.add(mat.get(row - 1).get(i - 1) +
                            mat.get(row - 1).get(i));
            }
            mat.add(arr);
        }
        return mat;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> mat = printPascal(n);
        for (int i = 0; i < mat.size(); i++) {
            for(int j = 0; j < mat.get(i).size(); j++) {
                System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}