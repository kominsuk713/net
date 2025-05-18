package basic;

public class ForStmt {
    public static void main(String[] args) {
        //for 반복문
        //(초기식;조건식;증감식)
//        int i = 0;
//        while (i<10) {
//
//       System.out.println(i);
//              i++;
//        }
        for (int n = 2; n <10 ; n++) {
            System.out.printf("---%d 단 ---\n",n);
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d X %d = %d\n", n, i, n * i);


            }
            System.out.println();
        }
    }
}
