package cls;

public class Student extends Person{
    private String school;
    private int grade;

    //생성자:이름,나이,성별,학교
    //grade는 무조건 1
    public Student(String name,int age,String gender,String school ) {
       super(name,age);   //Person의 생성자를 이용
       setGender(gender); //Person에 구현해놓은 setGender 메소드를 이용하여 설정

       this.school = school;
       grade=1;

    }

    @Override //해당 메소드를 재정의,메소드 오버라이드
    public void introduce() {
        super.introduce(); //부모 클래스(person)에서 정의된 introduce()메소드를 호출
        System.out.printf("학교는 %s에 다니고 있습니다.\n",school);
    }
}
