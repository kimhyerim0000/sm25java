package array;

import java.util.Arrays;
import java.util.Random;

public class array10 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(10) + 1;
            // num 값이 이미 배열에 있는지를 확인하고 배열에 넣어야한다.
            if (i == 0) {
                arr[i] = num;
            } else {
                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        i--;
                        break;
                    } else {
                        arr[i] = num;
                    }
                }
            }
        }
    }
}
