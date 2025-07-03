package control;

public class Control2 {
    public static void main(String[] args) {
        // 1~12까지의 합과 평균을
        // for문을 이용하여 구하시오
        int sum=0;
        int count=0;
        double avg=0.0; // 값을 어디서 출력할건지에 따라서 변수에 값을 지정해줘야한다.
        for(int i=1;i<=12;i++){
            sum+=i;
            count++;
        }
        System.out.println(sum);
        avg=(double)sum/count;
        avg=Double.valueOf(sum)/count;

        System.out.printf("%d , %6.2f",sum,avg );
    }
}
