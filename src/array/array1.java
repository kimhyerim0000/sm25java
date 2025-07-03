package array;

import java.util.Random;

public class array1 {
    public static void main(String[] args) {
        // Array의 단점
        // 1. 자바에서 array는 불변이다.
        // 2. 한가지 타입만 들어간다.

        // Reference Type...
        int [] arr1= new int[5];
        int [] arr2 = new int[5];
        int [] arr3= {1,2,3,4,5}; //4byte (32bit)

        Random rand=new Random(); //앞 문자가 대문자면 클래스임(API)

        for(int i=0;i<5;i++){
            arr1[i]=rand.nextInt(10)+1; // 0~10
        }
        for(int i=0;i<5;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int n:arr1){
            System.out.print(n+" ");
        }
    }
}
