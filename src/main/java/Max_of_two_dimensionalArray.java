import java.util.Arrays;

public class Max_of_two_dimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int) Math.round(Math.random() * 500);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int[] index = indexmax(array);
        System.out.println("Max is array[" + index[0] + "]" + "[" + index[1] + "]=" + array[index[0]][index[1]]);
    }

    private static int[] indexmax(int[][] arr) {
        int[] index = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > arr[index[0]][index[1]]) {
                    index[0] = i;
                    index[1] = j;
                }
            }

        }
        return index;
    }

}
