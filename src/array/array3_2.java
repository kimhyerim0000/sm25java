package array;

import java.util.Random;

public class array3_2 {
    public static void main(String[] args) {
        // 5개에 배열에 1~10까지의 숫자를 랜덤하게 입력하세요
        // 단, 중복되지 않게 입력하세요
        int [] array1= new int[5];

        Random rand=new Random();
        for(int i=0;i<array1.length;i++){
            array1[i]=rand.nextInt(10)+1;
            if(i!=0){
                for(int j=i+1;i>=0;i--){
                    if (array1[j]==array1[i]){
                        array1[j]=rand.nextInt(10)+1;
                    }
                }
            }
        }
        for(int n:array1){
            System.out.print(n+" ");
        }
        int min=array1[0];
        int max=array1[0];
        int imsi;
        for(int i=1;i<array1.length;i++){
            imsi=array1[i];
            if(imsi>max) { max=imsi;}
            if(imsi<min) {min=imsi;}
        }
        System.out.print("\n");
        System.out.printf("%d %d", min,max);
    }
}
