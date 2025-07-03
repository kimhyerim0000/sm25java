package array2;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        int[][] arr =new int[3][3];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                int num = random.nextInt(10) + 1;
                if (i == 0 && j == 0) {
                    arr[i][j] = num;
                } else {
                    boolean flag=true;
                    point: // j에 있는 for문으로 이동함.
                    for (int k = 0; k < i; k++) {
                        for (int n : arr[k]) {
                            if(n==num){
                                flag=false;
                                j--;
                                break point;
                            }
                        }
                    }
                    if(flag){
                        arr[i][j]=num;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int[] n: arr){
            for(int num:n){
                System.out.println(num+" ");
            }
            System.out.println();
        }
    }
}
