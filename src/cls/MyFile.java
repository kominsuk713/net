package cls;

public class MyFile {
    //파일이름(문자열),파일크기(int)를 '필드'로 갖는 클래스 MyFile을 정의하세요.
    private String fileName;
    private int fileSize;


    public MyFile(){
        fileName = "";
        fileSize = 0;
    }

    //추가생성자
    public MyFile(String fileName, int fileSize ){
        this.fileName=fileName;
        this.fileSize = fileSize;

    }

    public void setfileName(String fileName) {
        this.fileName=fileName;
    }


    public String getFileName() {
        return fileName;
    }

    public void setfileSize(int fs) {
        fileSize = fileSize;
    }


    public int getfileSize() {
        return fileSize;
    }


    @Override
    public String toString() {
        return String.format("File Name : %s,File Size : %d",fileName,fileSize);
    }

//    @Override
//    public boolean equals(Object o) {
//        if(o == null || getClass()!= o.getClass())
//        return false;
//
//        MyFile myFile = (MyFile) o ;
//    }
}
