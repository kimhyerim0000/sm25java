package array2;


import java.util.*;
//?
public class Array3 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // 1~100까지의 rnadom 한 숫자를 입력 한다.
        // 단, 중복 되서 들어가면 안된다.
        // 최종 배열을 출력.

        int[][] arr=new int[5][5];
        Random rand=new Random();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int num=rand.nextInt(100)+1;
                if(i==0 && j==0){
                    arr[i][j]=num;
                } else{
                    arr[i][j]=num;
                }
            }
        }
        List<Integer> list=new LinkedList<>();

        for(int[] n:arr){
            for(int num:n){
                list.add(num);
            }
        }
        System.out.println(list);
        for(int k=list.size()-1;k>0;k--){
            for(int j=k-1;j>=0;j--) {
                if (list.get(k).equals(list.get(j))){
                    System.out.println(list.get(j));
                }
            }
        }
//        System.out.println(list);
//        List<Integer> dp=new LinkedList<>();
//        int count=0;
//        for(int num:list){
//            count++;
//            if(list.contains(num)){
//                dp.add(num);
//            }
//        }
//        for(int num:dp){
//        }
        // 배운 방법으로 풀자
    }
}
