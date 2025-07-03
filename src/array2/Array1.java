package array2;

public class Array1 {
    public static void main(String[] args) {
        int[] a = new int[5]; // 0으로 초기화
        int[] b = {1, 2, 3, 4, 5};  // 12345로 배열초기화
//        int[] c=new int[];
        int[] c = new int[]{1, 2, 3, 4, 5};
        int[][] d = new int[3][3];
        int[][] e= new int[3][];
        e[0]=new int[3];
        e[1]=new int[2];
        e[2]=new int[3];

        int[][] f=new int[][]{{1,2,3},{1,2,3}};
        int[][] g={{1,2,3},{1,2,3}};
        int[][] h;
        //h={{1,2,3},{1,2,3}}; int 배열을 선언하고나서 초기화하는거는 불가. 왜냐하면 int[][] h라고 선언하면 뭘 만드는지 모르니깐
    }
}
