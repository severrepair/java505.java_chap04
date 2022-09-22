//  실행용 클래스
public class Mathod05 {
    
    public static void inCall() {
        System.out.println("Method05 클래스의 멤버 메소드");
    }
//    프로그램을 실행하기 위한 main 메소드가 존재
    public static void main(String[] args) {
//        메소드 호출하기
//        1. 클래스 내부 호출 : 동일한 클래스의 멤버끼리 호출하는 것
//        2. 클래스 외부 호출 : 다른 클래스의 객체를 생성하고 해당 객체의 멤버를 호출하는 것
        inCall();

        
//        Car2 클래스 타입의 변수 avante를 선언;
        Car2 avante;
//        new : 메모리 공간에 생성자를 통해 생성된 객체를 등록, 등록된 메모리 주소를 반환
//        생성자 : 지정한 클래스를 기반으로 객체를 생성
        avante = new Car2();    // Car2클래스 객체가 생성되고 Car2 클래스 타입의 변수 avante에 대입되어 사용준비가 완료 됨
//        클래스 외부 호출, 객체의 멤버 호출
        avante.name = "아반테";
        avante.run();
        avante.stop();
        avante.sound();

//        Car2 클래스 타입의 객체 생성
        Car2 sonata = new Car2();
        sonata.name = "소나타";
        sonata.run();
        sonata.sound();
        sonata.stop();

        Car3 car = new Car3();
        car.info();

        Car4 toress = new Car4("토레스","SUV");
        toress.info();

        Car4 santafe = new Car4("싼타페","SUV");
        santafe.info();


//        생성자 오버로딩
        Car4 canival = new Car4();
        canival.name = "카니발";
        canival.type = "SUV";
        canival.info();


        Car5 grander1 = new Car5();
        grander1.getInfo();

        Car5 K7 = new Car5("K7","세단","준대형");
        K7.getInfo();
        K7.getInfo("전기");
        K7.getInfo("가솔린",4000);
        K7.getInfo("가솔린","4000");
        K7.getInfo(4000,"경유");

        sum(10,20);
        sum(3.14,5.28);


    }//main


    public static void sum(int a, int b) {
        int result = a+b;
        System.out.println("두 수의 합은 덧셈은 " + result + "입니다.");
    }

    public static void sum(double a, double b) {
        double result = a +b;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
    }

    public static void sum(int a, double b) {

    }

    public static void sum(double a, int b) {

    }


}//class
