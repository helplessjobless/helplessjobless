public class TCMain {
    public static void main(String[] args) {
        //형 변환(Type Casting)
        //그릇의 종류 바꾸기

        //기본 자료형
        //정수 : int
        //실수 : double

        //int랑 int를 연산하면 : 결과 int
        //int랑 double을 연산하면 : 결과는 double

        double a = 10/4;
        System.out.println(a);

        //int 21억......long은 그것보다 크다
        int aa = 10;
        long bb= aa;//int->long 으로 타입을 바꾼 것
        System.out.println(bb);
        int cc = (int) bb; //★long->int로 바꾸려는 시도 ; 명시적 형 변환★

        double dd= cc; //int->double
        int ee = (int) dd; // double->int

        //마우스 에러줄 형변환 가능
        //맞는 타입으로 캐스트

        int b = 5;
        System.out.println(ee+b);
        System.out.println("------------------------");

        //String  + ? = String 이 된다.
        String ff = ee+ "";
        System.out.println(ff); //문자10
        System.out.println(ff+b); //문자10과 숫자5

    }
}
