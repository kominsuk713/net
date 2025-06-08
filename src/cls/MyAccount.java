package cls;

public class MyAccount {

//사용자 아아디(문자열)와 비밀번호(문자열)를 필드로 갖는 class MyAccount
//클래스를 정의하고 기본생성자에서는 아이디 = "",비밀번호 = ""로 정의하고,
//추가 생성자에서는 아이디와 비밀번호를 매개변수로 입력받아 필드에 대입하도록 정의하세요.

    private String Id;
    private String Password;

    //클래스를 정의하고 기본생성자에서는 아이디 = "",비밀번호 = ""로 정의하고,
    public MyAccount(){
        Id = "";
        Password = "";

    }
    //추가생성자
    public MyAccount(String Id, String Pw ){
        this.Id=Id;
        Password = Pw;

    }

    //Id,Password 필드에 대해서 각각 setter 와 getter를 정의하세요

    //toString 메소드를 재정의(Override)하세요

    //equals 메소드를 재정의하여 Id와 Password가 완전히 동일하면 true를 반환하고
    // 아니면 false 반환하도록 정의하세여.
    //Id:xxxx
    //Password

    public void setId(String Id) {
        this.Id = Id;
    }


    public String getId() {
        return Id;
    }

    public void setPassword(String Pw) {
        Password = Password;
    }


    public String getPassword() {
        return Password;
    }


    @Override
    public String toString() {
        return String.format("%Id : s\n Password: %s",Id,Password);
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof MyInt))
            return false;

        MyAccount acc = (MyAccount)obj;
        return Id.equals(acc.getId()) &&
                Password.equals(acc.getPassword());



    }




}
