import java.util.Scanner;

public class Mathod03 {

//    메소드 선언부= 실행방법
//    public static int input()  {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\n-----문제2-----\n");
//        System.out.print("출력할 구구단 단수를 입력하세요.");
//        int dansu = scanner.nextInt();
//        return dansu;
//
//
//    }//매소드 실행부
//
//    public static void output(int dansu) {
//        for (int i = 1; i <10; i++) {
//            System.out.println(dansu + "*" + i + "=" + dansu *i);
//        }
//
//    }

    public static int inputScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 : ");
        int score = scanner.nextInt();

        return score;
    }

    public static String calLevel(int score) {
        String level ="F";

        if (score >= 90) {
            level = "A";
        }
        else if (score >= 80) {
            level = "B";
        }
        else if (score >= 70) {
            level = "C";
        }
        else if (score >= 60) {
            level = "D";
        }

        return level;
    }


    public static void printResult(int score, String level) {
        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + level +"입니다.");
    }



    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\n-----문제2-----\n");
//        System.out.print("출력할 구구단 단수를 입력하세요.");
//        int dansu = scanner.nextInt();
//
//
//        for (int i = 1; i <10; i++) {
//            System.out.println(dansu + "*" + i + "=" + dansu *i);
//        }
        
//        int dansu = input();
//        output(dansu);


//        int score = inputScore();
//        String level = calLevel(score);
//        printResult(score, level);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("점수를 입력해주세요 : ");
//        int score = scanner.nextInt();
//        String level = "F";
//
//        if (score >= 90) {
//            level = "A";
//        }
//        else if (score >= 80) {
//            level = "B";
//        }
//        else if (score >= 70) {
//            level = "C";
//        }
//        else if (score >= 60) {
//            level = "D";
//        }
//
//        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + level +"입니다.");


        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        double avg = 0.0;
        String level = "F";

        kor = scoreInput("국어");
        eng = scoreInput("영어");
        math = scoreInput("수학");

        total = totalCal(kor, eng, math);
        avg = avgCal(total);
        level = leveCal(avg);

        printResult(total, avg, level);




//        Scanner scanner = new Scanner(System.in);
//        System.out.print("국어 점수를 입력해주세요 : ");
//        kor = scanner.nextInt();
//        System.out.print("영어 점수를 입력해주세요 : ");
//        eng = scanner.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        math = scanner.nextInt();
//
//        total = kor + eng + math;
//        avg = (double)total / 3;
//
//        if (avg >= 90) {
//            level = "A";
//        }
//        else if (avg >= 80) {
//            level = "B";
//        }
//        else if (avg >= 70) {
//            level = "C";
//        }
//        else if (avg >= 60) {
//            level = "D";
//        }
//
//
//        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + level + "입니다.");



    }   //main


    public static int scoreInput(String course) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(course + "점수를 입력해주세요 : ");
        int score = scanner.nextInt();

        return score;
    }

    public static int totalCal(int kor, int eng, int math) {
        return kor + eng + math;
    }

    public static double avgCal(int total) {
        return (double)total / 3;
    }

    public static String leveCal(double avg) {

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

    public static void printResult(int total, double avg, String level) {
        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 "
                + level + "입니다.");
    }





}   //class
