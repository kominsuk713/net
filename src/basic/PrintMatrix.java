package basic;

public class PrintMatrix {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int ten = i / 10;
            int il = i % 10;
            String str = "";


            if(ten % 3 ==0 && ten!=0)
                str ="짝";

            if(il % 3 ==0 && il!=0)
                    str +="짝";

            if(str.isEmpty()) //str이 빈 문자열이면 True를 반환한다.
                System.out.printf("%d\t\t",i);

            else
                System.out.printf("%s\t\t",str);


            if (i % 10 == 0)  //10단위체크
                System.out.println();



        }


    }
}


//git add-> git commit -m 날짜-> git push origin master
