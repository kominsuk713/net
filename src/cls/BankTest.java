package cls;
/// 천원 입금하는 메소드 호출하고 눈으로 확인하기
public class BankTest {
   public static void main(String[] args) {
      BankAccount bank = new BankAccount();
      bank.deposit(1000);
      bank.withdraw(2000);
      bank.withdraw(1000);

   }
}
