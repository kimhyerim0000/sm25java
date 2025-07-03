package array2;

import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        // 배열 선언
        int[][] arr=new int[3][3];
        Random rand=new Random();
        // 배열에 값을 입력
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int rNum=rand.nextInt(10)+1;
                if(i==0 && j==0){
                    arr[i][j]=rNum;
                }else{
                    boolean flag=true;
                    point:
                    // rNum이 배열에 있으면 다시 랜덤변수 생성
                    for(int k=0;k<=i;k++ ){
                        for(int l=0;l<=j;l++){ // 다시 생각좀 해보기-> j에 해당되는 rNum은 안들어간 상태임. l<=j해야함
                            if(rNum==arr[k][l]){
                                flag=false;
                                j--;
                                break point;
                            }
                        }
                    }
                    // rNum이 배열에 없으면 입력
                    if(flag==true) {
                        arr[i][j] = rNum;
                    }
                }
            }
        }
        // 배열 출력
        for(int[] a:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
