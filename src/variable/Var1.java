package variable;

public class Var1 {
    public static void main(String[] args){
        int intNum=10; // 32bit 4byte
        long doubleNum=100000000000L; // 64bit 8byte, 기본은 int형이기 때문에 D를 붙여서 long형인걸 표시함. 오른쪽->왼쪽으로 컴파일됨 -2^63 ~ 2^63-1

        byte b1=10;
        byte b2=10; //오른쪽에서 계산한 결과는 모두 int임.
        //byte b3=b1+b2; 이것의 오른쪽 계산식도 int이기 때문에 형변환 해줘야함
        byte b3= (byte) (b1+b2);
        System.out.println(b3);

        int num1=1500000000;
        int num2=1500000000;
        int result =num1+num2;  // int의 범위: ~2,147,483,648 ~ 2,147,483,647
        // 범위 오류로 - 값으로 나옴
        System.out.println(result);

        // 실수는 기본이 double
        float f1=1000000.0F;
        float f2=1000000.0F;
        float f3=f1+f2;
        System.out.println(f3);
        double d1=1000000.0;
    }
}
/*
* */
