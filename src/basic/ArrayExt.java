package basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArrayExt {
    public static void main(String[] args) {
        // primitive type :byte , char ,short ,int ,long , float,double
        //referenced type :String, = class
        //Wrapper Class
        // Byte a1 = 1;
        //  byte a =1;
        //Byte,Character,Short,Integer,Long,Float,Double,Boolean


        int[] arr = new int[10];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(45) + 1;
        }
//        for (int n : arr ){
//            System.out.printf("%d\t",n);
//        }
//        Arrays.toString(arr) : arr배열을 문자열로 변환
        //System.out.println( Arrays.toString(arr) ); //디버깅 용도

//        // 오름차순
//        Arrays.sort( arr );
//        System.out.println( Arrays.toString(arr) );
//         //내림차순
//       Arrays.sort( arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(arr));


        //val을 arr에서 찾아보고 몇번째 인덱스에 있는지 배열과 해당 인덱스값을 출력하기
        //찾았을 때)
        //[배열...]
        //val:xx는 index:yy에 있습니다.

        // 못 찾았을 때)
        //[배열...]
        //val:xx는 배열에 존대하지 않습니다..

        //배열 전체를 출력 : 검색 결과 유무에 상관없이 출력
        System.out.println(Arrays.toString(arr));

        boolean find = false; // 검색 성공 여부 체크하는 플래그
        int val = rand.nextInt(45) + 1;
            for(int i=0;i<arr.length;i++) {
                if(val == arr[i]){
                    System.out.printf("val : %d는 인덱스 %d에 있습니디ㅏ\n",val,i );
                    find = true;
                    break;
                }


            }

            if(!find){
                System.out.printf("val:xx는 배열에 존대하지 않습니다..\n",val);
            }

        //순서대로 정렬하기

//        for(int i =0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if (arr[i] > arr[j]) {
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//                }
//            }
//            System.out.println( Arrays.toString(arr) );
    }
}


