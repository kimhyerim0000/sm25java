package operation;

public class Op3 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        char c=' ';
        char d=65;
        if(a < b){
            c='T';
        }else{
            c='F';
        }
        System.out.println(c);

        //삼항 연산자로 구현하시오
        int max;
        max=(a>b)? (a>c? a:c): (b>c? b:c);
        System.out.println(max);
    }
}
