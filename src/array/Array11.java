package array;

import java.util.Arrays;
import java.util.Random;

public class Array11 {
    public static void main(String[] args) {
        int arr [] = new int[5];
        Random rand = new Random();
        for(int i=0;i<5;i++){
            int num = rand.nextInt(10)+1;

            if(Arrays.stream(arr).anyMatch(value->value==num)){
                if(i!=0){
                    i--;
                }
            }else{
                arr[i]=num;
            }

//            if(!Arrays.asList(arr).contains(num)){
//                arr[i] = num;
//            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}
