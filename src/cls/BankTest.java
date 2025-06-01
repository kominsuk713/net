package cls;
/// 천원 입금하는 메소드 호출하고 눈으로 확인하기
public class BankTest {
   public static void main(String[] args) {
      BankAccount bank = new BankAccount();
      bank.deposit(1000);

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

   //withdraw:출금 기능을 구현하세요
   //매개변수:출금할 금액
   //반환값은 출금하고 남은 값
   //출금할 금액이 예금되어 있는 금액보다 크면 출금을 할 수 없음.
}
