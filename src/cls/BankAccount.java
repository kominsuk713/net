package cls;

public class BankAccount {

    private int money;


    public BankAccount() {
        money = 0;


    }

    public BankAccount(int money) {
        this.money = money;


    }

    //외부에서 접근 가능한 view 라는 메소드를 작성하세요.
    //반환값 없음,매개변수 없음
    //외부에서 view를 호출하면 다음과 같은 결과가 출력되어야 합니다.
    //Balance : xxxxxxx원

    public void view() {
        // 공개   반환값x  view 매개변수x
        System.out.printf("Balance : %d원\n", money);

    }
    //외부에서 접근 가능한 deposit라는 메소드를 작성하세요
    //반환값은 없음,매개변수는 money이고 팔두 money의 값을 매개변수 money의 값으로 누적시킵니다.
    //실행결과
    //deposit: xxxxxx원
    //Balance: xxxxxx원

    public void deposit(int money){
        this.money+=money; //누적시키기
        System.out.printf("deposit : %d원\n", money);
        view();
    }


}
