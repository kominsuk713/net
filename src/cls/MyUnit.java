package cls;

    //Marine:steampack
    //Tank:공격력 +20,체력 +100

    //필드(Field):멤버 변수,정수형으로 hp,power
    //메소드:멤버 함수
    //매개 변수(인수 , 인자):메소드에서 외부로부터 주어지는 입력값으로 초기화되는 변수
    //매개변수가 정의되는 곳은 매소드 명([매개변수들])

public class MyUnit {

    //필드(Field):멤버 변수,정수형으로 hp,power
    private int hp;
    private int power;
    private String name;

    //hp,power=100으로 하는 기본 생성자

    public MyUnit(){
        hp = 100;
        power = 100;

    }

    //외부로부터 hp와 power를 입력받아서 멤버 hp와 power를 설정하는 생성자
    public MyUnit(String name,int hp,int power) {
        this.hp = hp;
        this.power = power;
        this.name = name;
    }
    //외부에서 호출가능하도록
    //반환 값이 없는 메소드 damage를 만드세요
    //매개 변수로 power가 주어지고 ,
    //멤버 변수 hp를 매개변수 power만큼 차감합니다
    //hp에서 power를 차감한 값이 음수이면 hp는 0으로 처리합니다.


    public void damage (int power) {
        hp -= power; //누적시키기
        if (hp < 0) {
            hp = 0;
        }

    }

    public void attack(MyUnit target){
        target.damage(power);
    }

    //외부에서 호출가능하도록
    //hp와 power를 출력하는 메소드 info를 만드세요
    public void info(){
        System.out.printf("[%s]hp:%d,power:%d\n",name,hp,power);
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getPower(){
        return power;
    }

}
