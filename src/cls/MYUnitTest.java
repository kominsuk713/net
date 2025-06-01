package cls;

public class MYUnitTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("Marine", 200, 10);
        MyUnit t1 = new MyUnit("Tank", 300, 35);

        //object : 모든 클래스들 중에서 최상위 클래스
        System.out.println("m1은 Marine의 인수턴스인가 : "+ (m1 instanceof Marine));
        System.out.println("m1은 MyUnit의 인수턴스인가 : "+ (m1 instanceof MyUnit));
        System.out.println("m1은 Object의 인수턴스인가 : "+ (m1 instanceof Object));
        System.out.println("t1은 String의 인수턴스인가 : "+ (t1 instanceof Marine));


        m1.steampack();
        m1.attack(t1);
        m1.info();
        t1.info();


    }
}
