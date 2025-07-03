package control;

public class Control5 {
    public static void main(String[] args) {
        // 1~10 까지의 숫자 중 짝수의 합과 평균을 구하시오
        // while
        int i=1;
        int sum=0;
        int count=0;
        double avg=0.0;
        while(i<11){
            if(i%2==0) { sum+=i; count++;}
            i++;
        }
        avg=(double)sum/count;
        System.out.printf("%d, %5.2f",sum,avg);
    }
}