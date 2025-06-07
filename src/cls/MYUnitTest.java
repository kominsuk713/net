package cls;

public class MYUnitTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("Marine", 200, 10);
        MyUnit t1 = new MyUnit("Tank", 300, 35);

        //object : 모든 클래스들 중에서 최상위 클래스
//        System.out.println("m1은 Marine의 인수턴스인가 : "+ (m1 instanceof Marine));
//        System.out.println("m1은 MyUnit의 인수턴스인가 : "+ (m1 instanceof MyUnit));
//        System.out.println("m1은 Object의 인수턴스인가 : "+ (m1 instanceof Object));
//        System.out.println("t1은 String의 인수턴스인가 : "+ (t1 instanceof Marine));

        System.out.println(); //[Tank] hp:300,power:35


        MyStack st1 = new MyStack(); //5칸짜리 스택
        MyStack st2 = new MyStack(10);

        st1.add(100);
        st1.add(200);
        st1.add(300);
        st1.add(400);
        st1.add(500);
        st1.add(600);
        st1.add(700);
        System.out.println(st1);

        //[100,200,300,400,500]나오게 하기


//        int num = 0;
//        num = st1.pop();
//        System.out.println(num);
//
//        num = st1.pop();
//        System.out.println(num);
//
//        num = st1.pop();
//        System.out.println(num);
//
//        num = st1.pop();
//        System.out.println(num);
//
//        num = st1.pop();
//        System.out.println(num);
//
//        num = st1.pop();
//        System.out.println(num);
//


    }


//
//        m1.steampack();
//        m1.attack(t1);
//        m1.info();
//        t1.info();


    }

