public class Variable02 {
    public static void main(String[] args) {
        /*

기본형(primitive type) 변수


정수형 : byte, short, int, long
실수형 : float, double
문자형 : char
논리형 : boolean

메모리 공간중 stack 영역에 실제 데이터가 저장
stack 영역 데이터들은 프로그램 종료시 자동처리됨

참조형(reference type) 변수
객체의 참조 값을 나타내는 자료형
문자열 : String
실제 값은 heap영역에, stack에는 값이 있는 heap영역의
번지수가 저장
heap 영역은 수동으로 정리 해줘야됨 (C언어 등)
자바는 자동처리됨 => GC (Garbage Collection)

1.1 정수형(소수점 없는 숫자)
byte 127까지, short 32222까지, int 21억 .. , long

*/
        long myAge = 14567896432121325L;
        System.out.println(myAge);
/*
1.2 실수형(소수점 있는 숫자)
보통 double(default)
 */
        float eyeSight = 0.5f;
        double weight = 60.55;
//        1.3 문자형(한글자)
        char gender = '남';
//        1.4 논리형(참/거짓) true, false
        boolean soldOut = true;
        System.out.println(soldOut);

        int a = 10;
        int b = 20;
//        ★변수 여러 개를 한꺼번에 정의 가능
        int c,d,e;
        c=10;
        d=20;
        e=30;

        boolean judge = c<e;

        System.out.println(a>b);
        System.out.println(c<e);

//        3. 아무것도 없다
//        void







    }
}