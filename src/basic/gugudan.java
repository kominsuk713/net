package basic;

import java.util.Scanner;



import java.util.Scanner;

public class gugudan {

    public static void main(String[] args) {
        //사용자에게 단수를 입력받아서 해당 단수 구구단을 출력하는 코드를 작성하세요
        System.out.println("단수를 입력하세요>>>");
        Scanner sc2 = new Scanner(System.in);
        int dan = 1;
        while(true){
            System.out.println("단수를 입력하세요>>>");
            dan = sc2.nextInt();
            if (dan==0) break;
        }

        int n=1;
        while(n<10){
            System.out.printf("%d X %d = %d\n",dan, n,dan*n);
            n++;
        }



        sc2.close();

    }
}
