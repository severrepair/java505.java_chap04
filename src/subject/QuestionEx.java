package subject;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class QuestionEx {
    private static Scanner scanner;

    public static void main(String[] args){
        scanner = new Scanner(System.in);

//        문제 1)
        System.out.print("알파벳 하나를 입력하세요 : ");
        String str = scanner.next();    // 문자열로 읽음
//        charAt() : String 타입의 데이터 중 지정한 index의 문자를 char 타입으로 변환
        char c = str.charAt(0);     //문자열의 첫 번째 문자,

//        char 타입의 데이터 a는 문자로는 'a' 정수로는 97로 표현
        for(char a = 'a'; a <= c; a++) { // 'a' = 아스키 코드 97
            for (char b = a; b<= c; b++) {  //  'a'~ 입력한 문자 만큼증가 (아스키코드 값증가)
                System.out.print(b);    // for문 출력
            }
            System.out.println();   // 줄바꿈
        }   // 첫번재 for로 올라가서 아스키코드 값('a)을 증가 시킨후 입력값 c(아스키코드 10진수값)가
            // 될때까지 반복 (a가 아닌 b부터 시작)


//        문제 2)
        int arrQuiz2[]=new int[10]; //데이터 저장문 배열의 길이는 10

        for (int i = 0; i < arrQuiz2.length; i++) {
            System.out.print("정수를 입력해 주세요 (현재 " + (i+1) +  " 번) :");
            arrQuiz2[i] = scanner.nextInt();    // 입력한 값을 i에 저장후 배열에 저장
        }   //배열 길이 만큼 저장반복

        for (int i=0; i<arrQuiz2.length; i++) {
            if (arrQuiz2[i] % 3 ==0) {
                System.out.print(arrQuiz2[i] + " ");
            }   // 입력한값 i를 3으로 나눴는데 나머지가 0 인것만 출력
        }   // 배열 길이만큼 계속 출력

//        문제3) 실습문제 6
//        1.eng 배열을 전체 검색하여 사용자가 입력한 단어가 있는지 확인
//        2. 있으면 해당 index 번호 확인하고 검색 중지
//        3. kor 배열의 index 번호에 있는 단어 출력
//        4. 입력된 단어가 exit 이면 프로그램 종료
        String eng [] = {"student", "love", "java", "happy", "future"};
        String kor [] = {"학생", "사랑", "자바" ,"행복한", "미래"};
        System.out.println("영어단어를 입력하세요.");

        while (true) {
            String quiz3Str = scanner.next();

            if (quiz3Str.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }

            int index = -1;
            for (int i = 0; i < eng.length; i++){
                if (quiz3Str.equals(eng[i])) {
                    index = i;
                    break;
                }
            }


        if (index > -1) {
            System.out.println(kor[index]);
        }
        else {
            System.out.println("그런 영어 단어가 없습니다.");
        }
    }   //문제 3


//        문제4)
//        1. 0 ~ 99 까지의 숫자를 컴퓨터가 랜덤 숫자 선택, 사용자가 키보드로 입력
//        2. 사용자 입력을 통해 얻은 데이터가 높은지 낮은지 판단 (if ~ else문), 반복 실행
//        3. 정답을 맞춘 후 다시 게임을 할 것인지 확인
        Random r = new Random();    // 랜덤 값 생성하기 위한 클래스
        int card;   // 컴퓨터가 랜덤으로 생성한 데이터가 저장될 변수
        int low;    // 카드에 적힌 수의 범위를 설정할 변수
        int high;

//        전체 게임의 시작, 무한 반복
        while (true) {
            int i =1;   // 몇 번재 입력인지 확인하기 위한 변수
            low = 0;    //  게임 시작 시 초기값을 가장 작은 0으로 설정
            high = 99;  // 게임 시작 시 초기값을 가장 높은 99로 설정
            card = r.nextInt(100);
            System.out.println("UP & DOWN 게임이다. 숨겨진 수를 맞추어 보세요");

//            사용자 입력을 반복
            while (true) {
                System.out.println(low + " - " + high);
                System.out.println(i + " >> ");

                int count = scanner.nextInt();  //  사용자 입력
                
//                정상 범위 내의 입력인지 확인
                if (count > high || count < low) {  // 카운트가 하이보다 크거나 카운트가 로우보다 작거나
                    System.out.println("범위를 벗어났습니다.");
                }
                else {
//                    입력 값이 컴퓨터의 랜덤 값과 같을 경우
                    if (count == card){
                        System.out.println("정답 입니다.");
                        break;  //  내부 while문을 종료
                    }
//                    사용자 입력이 컴퓨터의 랜덤 값보다 클 경우
                    else if (count > card) {
                        System.out.println("더 낮게");
                        high = count;   //  최대 크기의 범위를 사용자의 입력 데이터로 설정
                    }
//                    사용자 입력이 컴퓨터의 랜덤 값보다 작은 경우
                    else {
                        System.out.println("더 높게");
                        low = count;    //  최소 크기의 범위를 사용자의 입력 데이터로 설정
                    }
                }
                i++;
            }
            System.out.println("다시 하시겠습니까? (y/n) >>");
//            게임이 끝나고 새 게임을 시작할 것인지 확인
            if (scanner.next().equals("n")) {
                break;  //  외부 while문을 종료
            }
        }

//        문제5)
        int intArray[][];
        intArray = new int[3][4];   // 4칸짜리가 3줄 배열 생성, 3열 4행 배열
        
//        입력부분
        for (int i = 0; i<3; i++){
            for (int j=0; j<4; j++) {
//                Math.random() * 10 : 랜덤 숫자를 발생시키기 위한 수학 클래스의 함수, 0.0 ~ 0.1
//까지의 숫자를 랜덤하게 출력함 ,기본적으론 실수타입으로 출력함, * 10을 진행하여 정수 부분이 나올 수 있도록 함
//                (int) 를 사용하여 소수점 뒤의 숫자를 삭제하고 정수로 강제 형변환
                intArray[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i=0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();   // 줄바꿈
        }

        int i = 0;
        int sum = 0;
        while (i < 3) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum = sum + intArray[i][j];
            }
            i++;
        }

        System.out.println("합은 : " + sum);

//        while (i < 3) {
//            int j = 0;
//            while (j < intArray[i].length) {
//                sum += intArray[i][j];
//                j++;
//            }
//            i++;
//        }


    }   //main
}   //class
