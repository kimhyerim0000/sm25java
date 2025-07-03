package operation;

public class Op4 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        // 3수의 최대 값과 최소 값을 구하시오
        int max = 0,min=0;
        if( a>b) {
            min=b;
            max=a;
        }else if(a<b) {
            min=a;
            max=b;
        }
        if(max<c){
            max=c;
        } else if(max>c){
            if(c<min){
                c=min;
            }
        }
        System.out.println(max);
        System.out.println(min);


        // 3수의 최대 값과 최소 값을 구하시오
        //if

    }
}
