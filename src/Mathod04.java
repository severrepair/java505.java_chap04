import java.util.Arrays;
import java.util.Scanner;

public class Mathod04 {

    public static int[] input() {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[10];

        System.out.println("정수 10개 입력>>");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static void  output(int numbers[]) {
        for (int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }


    public static void main(String[] args) {
//        문제 1) 책 126페이지의 5번 문제를 풀고, 메소드를 사용하는 방식으로 변환하세요.
//        Arrays 클래스의 정렬 메소드 sort()를 사용하여 정렬
//        int nums[] = {10, 50, 80, 70, 20};
//        Arrays.sort(nums);

//        int numbers[] = new int[10];
        int numbers[];
        numbers = input();
        output(numbers);
        System.out.println();

        Arrays.sort(numbers);

        output(numbers);

//        Scanner scanner = new Scanner(System.in);
//        int numbers[] = new int[10];
//
////        입력부분
//        System.out.println("정수 10개 입력>>");
//        for(int i=0; i<numbers.length; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
////        정렬부분
//        Arrays.sort(numbers);
//        for (int i = 0; i<numbers.length; i++) {
//            for (int j = i; j < numbers.length; j++) {
//                if (numbers[i] > numbers[j]) {
//                    int tmp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = tmp;
//                }
//            }
//
//        }
//
//
////        출력부분
//        for (int i = 0; i<numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
                
            
            
            
        








    }
}
