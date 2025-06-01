package cls;
// Random이라는 클래스를 사용하기 위해 이 파일에 임포트 시킴

public class MyPersonTest {
    public static void main(String[] args) {

        //primitive type : byte,char,short,int,long,float,double,boolean
        //referenced type : String,...

        //Person : class
        //k1 : object (객체,인스턴스(실행된 상태))
        // 클래스명 객체명 = new 생성자();
        Person k1 = new Person(name, age, gender); //person클래스로부터 k1인스턴스가 생성되며,생성자가 자동으로 호출된다.


        k1.increaseAge();
        k1.setGender("남성");
        k1.setGender("남자");
        k1.introduce();
        int k1_age = k1.getAge();
        System.out.println(k1_age);
        // k1.gender = "남성"


        Person k2 = new Student("홍길동",18,"남성","하바드");
        k2.introduce();


        String str = new String("대한민국");
        System.out.println( str );

        System.out.println( k1 ); //person.toString()메소드를 재정의하여 인스턴스를 문자열로 반환한다.
        System.out.println( k2 );





    }
}
