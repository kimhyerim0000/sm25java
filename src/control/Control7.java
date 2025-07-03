package control;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Control7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter COmmand:");
            String cmd=sc.nextLine();
            if(cmd.equals("q")){
                System.out.println("Quit...");
                break;
            }else if(cmd.equals("arr1")){
                // 1~10까지의 숫자를 하나 입력 받는다.
                System.out.println("Enter the number1");
                String num=sc.nextLine();
                System.out.println("Enter the number2");
                String num2=sc.nextLine();
                // String 형은 heap에 저장되기 때문에, (Integer)num 이딴식으로는 형변환 못한다. 함수 사용해줘야함.
                int n1=Integer.parseInt(num);
                int n2=Integer.parseInt(num2);
                System.out.printf("Add: %d\n", n1+n2);
            }else if(cmd.equals("arr2")){
                // 한개의 1~10까지의 숫자를 입력받는다.
                // 해당 사이즈의 1차원 배열을 생성한다.
                // 배열에 랜덤하게 1~10까지의 값을 입력 한다. 중복되지 않게 입력
                // 1. 배열값을 출력
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력
                int count=0;
                Random rand=new Random();
                System.out.println("배열 크기를 입력하세요");
                int arrScale2=sc.nextInt();
                int[] arr2=new int[arrScale2];
                while(count<arrScale2){
                    int imsi=rand.nextInt(10)+1;
                    if(count==1) {
                        arr2[count] = imsi;
                        count++;
                    } else{
                        boolean flag=true;
                        point:
                        for(int num: arr2){
                            if(num==imsi){
                                count--;
                                flag=false;
                                break point;
                            }
                        }
                        if(flag){
                            arr2[count]=imsi;
                            count++;
                        }
                    }
                }// 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력
                int sum=0;
                int max=arr2[0];
                int min=arr2[0];
                for(int n: arr2){
                    sum+=n;
                    count++;
                    if(n>max){max=n;}
                    if(n<min){min=n;}
                }
                System.out.println(Arrays.toString(arr2));
                System.out.printf("Sum: %d, Avg: %f\n", sum, (double)sum/count );
                System.out.printf("Max: %d, Min: %d\n", max, min);
            }else if(cmd.equals("arr3")){
                // 두개의 1~10까지의 숫자를 입력받는다.
                // 해당 사이즈의 2차원 배열을 생성한다.
                // 배열에 랜덤하게 1~10까지의 값을 입력 한다. 중복되지 않게 입력
                // 1. 배열값을 출력
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력
                System.out.println("Enter the 행");
                int n1=sc.nextInt();
                System.out.println("Enter the 열");
                int n2=sc.nextInt();
                int[][] arr3=new int[n1][n2];
                Random rand=new Random();
                for(int i=0;i<n1;i++){
                    for(int j=0;j<n2;j++){
                        int inputNum=rand.nextInt(10)+1;
                        if( arr3[i][j]==arr3[0][0]){
                            arr3[i][j]=inputNum;
                        }else{
                            boolean flag=true;
                            point:
                            for(int k=0;k<=i;k++){
                                for(int l: arr3[k]){
                                    if(l==inputNum){
                                        j--;
                                        flag=false;
                                        break point;
                                    }
                                }
                            }
                            if(flag) {
                                arr3[i][j] = inputNum;
                            }
                        }
                    }
                }
                System.out.println(Arrays.toString(arr3));
                int count=0;
                int sum=0;
                int max=arr3[0][0];
                int min=arr3[0][0];
                for(int[] arr: arr3){
                    for(int num: arr){
                        System.out.print(num+" ");
                        count++;
                        sum+=num;
                        if(num>max){max=num;}
                        if(num<min){min=num;}
                    }
                }
                System.out.println();
                System.out.printf("Sum : %d, Avg: %f", sum, (double)sum/count);
                System.out.printf("Max: %d, Min: %d\n", max, min);
            }else{
                System.out.println("Invalid COmmand");
            }
        }
        sc.close();
    }
}
