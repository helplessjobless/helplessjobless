import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        //값 입력받아서 처리하기

        Scanner keyboard = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = keyboard.next();

        System.out.println("나이를 입력하세요");
        int age = keyboard.nextInt();

        System.out.println("사는 곳을 입력하세요");
        String livingPlace = keyboard.next();

        System.out.println("*********************");
        System.out.println("* 이름 : " + name + "\t\t*");
        System.out.println("* 나이 : " + age + "\t\t\t*");
        System.out.println("* 사는곳 : " + livingPlace + "\t\t*");
        System.out.println("*********************");

    }
}
