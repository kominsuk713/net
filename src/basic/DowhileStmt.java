package basic;

import java.util.Scanner;

public class DowhileStmt {
    public static void main(String[] args) {
//        do~while
//        do{
//              반복 실행될 명령문들
//        }while (조건식);
        //        do{
//            while (n < 10){
//                System.out.println("");
//            }
//            System.out.println("");
//            while( n > 10){
//                break;
//            }
//        }while( n < 10 );

        System.out.println("단수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int dan = 1;


        do{
            System.out.println("단수를 입력하세요>>>");
            dan = sc.nextInt();
            if (dan==0) break;


        int n=1;
        while(n<10){
            System.out.printf("%d X %d = %d\n",dan, n,dan*n);
            n++;
        }

        }while(true);
        sc.close();
        System.out.println("프로그램이 종료되었습니다");
    }
}

