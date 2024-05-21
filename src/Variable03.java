public class Variable03 {
    public static void main(String[] args) {

//      2.1 문자 / 문자열(여러 자)
//        String
//        이름 저장
        String myName = "mz";
        System.out.println(myName);

        /*
        * 정수 : int
        * 실수 : double
        * 글자 : String
        * */

//        내 개인 정보
//        이름, 나이, 키
        String name = "mz";
        int age = 20;
        double height = 170.5;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);


        String modelName = "iphone6";
        String maker = "Apple";
        double display = 5.6;
        int price = 1000;
        boolean soldOut = true;

        /*test
        * 보이는 그래도 콘솔에(변수를 사용해서) 5개
        *
        * */
        System.out.println("핸드폰 정보 *************");
        System.out.println("모델명\t\t-  " + modelName);
        System.out.println("제조사\t\t-  " + maker);
        System.out.println("디스플레이\t-  " + display + "inch");
        System.out.println("가격\t\t\t-  " + price + "$");
        System.out.println("재고유무\t\t-  " + soldOut);
        System.out.println("**********************");



    }
}
