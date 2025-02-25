
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(method1(7));
        System.out.println(method2(123));
        int[] arr = new int[]{12, 4, 5, 4, 12};
        System.out.println(method3(arr));
        String str = "hello hello";
        String sub = "hello";
        System.out.println(method5(str, sub));
        int size = 8;
        int[][] board = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
        method6(board);
        print(board);
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 9},
                {6, 5, 8}
        };
        int[][] newMat=method7(mat);
        print(newMat);

    }

    public static boolean method1(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static int method2(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean method3(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void method4(int[] arr) {
        Arrays.sort(arr);
    }

    public static int method5(String str, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void method6(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (i + j) % 2;
            }
        }
    }

    public static void print(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static int[][] method7(int[][] mat) {
        int rows = mat.length;
        int[][] newMat = new int[rows][mat[0].length];

        for (int i = 0; i < rows; i++) {
            newMat[i] = mat[rows - 1 - i];
        }
        return newMat;
    }
}


