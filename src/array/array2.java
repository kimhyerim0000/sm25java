package array;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        String[] strs=new String[3];
        // 3번 문자를 입력 받아 배열을 출력 하시오
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            strs[i]=sc.nextLine();
        }
        for(String n:strs){
            System.out.print(n+" ");
        }
        sc.close(); // 꼭필요함!
    }
}
