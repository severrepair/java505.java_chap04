import java.util.Scanner;

public class Mathod02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        문제 1) 사칙연산을 하기 위한 매소드를 메소드의 4가지 형태로 각각 생성하여 실행하는 프로그램을 작성하세요.
//        1. 더하기, 빼기, 곱하기, 나누기 를 각각 4가지 형태로 생성
//        2. 이름 1번 타입의 함수 이름: sum1, sub1, multi1, div1
//              2번 타임의 함수 이름: sum2, sub2, multi2, div2
//              3번 타입의 함수 이름: sum3, sub3, multi3, div3
//              4번 타입의 함수 이름: sum4, sub4, milti4, div4
//        3. 각각의 함수를 모두 실행하여 결과를 확인
        
//        문제2) 사용자 입력을 통해서 2~9 까지의 숫자를 입력받아 해당하는 단수의 구구단을 출력하는 프로그램을 작성하세요.
//        1.구구단을 출력하는 부분을 함수로 구현 (함수명: gugudan)
//        2.사용자 입력 부분은 함수로 구현해도 되고 안해도 됨
        
//        문제3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력받고, 총 점과, 평균, 등급을 출력하는 프로그램을 작성하세요.
//        1. 등급 계산 부분을 함수로 구현 (함수명: scores)
//        2. 총점과 평균 계산 부분을 함수로 구현 (함수명 : average)
//        3. 등급은 90이상 A,80이상 B, 70이상 C, 60이상 D, 60미만 F
//        4. 등급은 평균 점수를 기반으로 함
//        5. 출력형태는 총점, 평균, 등급을 모두 출력

        System.out.println("\n-----문제1 1번타입-----\n");
        sum1();
        sub1();
        multi1();
        div1();

        System.out.println("\n-----문제1 2번타입-----\n");
        sum2(10,20);
        sub2(10,20);
        multi2(10,20);
        div2(20,10);

        System.out.println("\n-----문제1 3번타입-----\n");
        int result = sum3();
        System.out.println("두 수의 덧셈은 : " + result);
        int result2 = sub3();
        System.out.println("두 수의 뺄셈은 : " + result2);
        int result3 = multi3();
        System.out.println("두 수의 곱셈은 : " + result3);
        int result4 = div3();
        System.out.println("두 수의 나눗셈은 : " + result4);

        System.out.println("\n-----문제1 4번타입-----\n");
        int Result = sum4(10,20);
        System.out.println("두 수의 덧셈은 : " + Result);
        int Result2 = sub4(10,20);
        System.out.println("두 수의 뺄셈은 : " + Result2);
        int Result3 = multi4(10,20);
        System.out.println("두 수의 곱셈은 : " + Result3);
        int Result4 = div4(20,10);
        System.out.println("두 수의 나눗셈은 : " + Result4);

        System.out.println("\n-----문제2-----\n");
        System.out.print("출력하고자 하는 구구단의 단수를 입력하세요 : ");
        gugudan();

//        선생님답
/*        int dansu = scanner.nextInt();
        gugudan(dansu);*/

        System.out.println("\n----- 3번 문제 -----\n");
        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        double avg = 0.0;
        String level = "F";

        System.out.print("국어 점수를 입력해주세요 : ");
        kor = scanner.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        eng = scanner.nextInt();
        System.out.print("수학 점수를 입력해주세요 : ");
        math = scanner.nextInt();

        total = kor + eng + math;
        avg = average(total);
        level = scores((int)avg);

        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");

    }
    
    
//    문제1번타입
    
    public static void sum1() {
        int a=10;
        int b=20;
        int result = a + b;
        System.out.println("두 수의 덧셈은 : " + result);
    }
    public static void sub1() {
        int a=10;
        int b=20;
        int result = a - b;
        System.out.println("두 수의 뺄셈은 : " + result);
    }
    public static void multi1() {
        int a=10;
        int b=20;
        int result = a * b;
        System.out.println("두 수의 곱하기는 : " + result);
    }
    public static void div1() {
        int a=20;
        int b=10;
        int result = a / b;
        System.out.println("두 수의 나눗셈 : " + result);
    }

//    2번타입
    public static void sum2(int a, int b) {
    int result = a + b;
    System.out.println("두 수의 덧셈은 : " + result);
}

    public static void sub2(int a, int b) {
        int result = a - b;
        System.out.println("두 수의 뺄셈은 : " + result);
}

    public static void multi2(int a, int b) {
        int result = a * b;
        System.out.println("두 수의 곱셈은 : " + result);
    }
    public static void div2(int a, int b) {
        int result = a/b;
        System.out.println("두 수의 뺄셈은 : " + result);
    }



//    3번타입
    public static int sum3() {
        int a = 10;
        int b = 20;
        int result = a + b;
        return result;
    }
    public static int sub3() {
        int a = 10;
        int b = 20;
        int result2 = a - b;
        return result2;
    }
    public static int multi3() {
        int a = 10;
        int b = 20;
        int result3 = a * b;
        return result3;
    }
    public static int div3() {
        int a = 20;
        int b = 10;
        int result4 = a / b;
        return result4;
    }


//    4번타입
    public static int sum4(int a, int b) {
    int result = a+b;
    return result;
}
    public static int sub4(int a, int b) {
        int result = a-b;
        return result;
    }
    public static int multi4(int a, int b) {
        int result = a*b;
        return result;
    }
    public static int div4(int a, int b) {
        int result = a/b;
        return result;
    }

//    문제 2번
    public static void gugudan() {
        int dan = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + (dan * i));
        }
    }
    
    
/*    문제2번 선생님답
    public static void gugudan(int dan) {
        for (int i = 1; i <10; i++) {
            System.out.println(dan + "*" + i + "=" + dan*i);
        }
        
    }
    */
    

//    문제 3번

    public static String scores(int avg) {
        String level = "F";

        if (avg >= 90) {
            level = "A";
        }
        else if (avg >= 80) {
            level = "B";
        }
        else if (avg >= 70) {
            level = "C";
        }
        else if (avg >= 60) {
            level = "D";
        }

        return level;
    }

    public static double average(int total) {
        return (double)total / 3;
    }



    }//클래스
