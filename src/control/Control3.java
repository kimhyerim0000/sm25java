package control;

public class Control3 {
    public static void main(String[] args) {
        // 1~10 까지 합과 평균 구하시오
        // while
        int sum=0;
        double avg=0.0;
        int i=1;
        int count=0;
        while(i<11){
            sum=sum+i;
            i++;
            count++;
        }
        avg=Double.valueOf(sum)/count;
        System.out.printf("%d, %5.2f", sum, avg);
    }
}
