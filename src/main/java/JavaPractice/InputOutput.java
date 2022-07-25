package JavaPractice;


public class InputOutput {
    public static void main(String[] args) {
        les1();
        les2();
        les3();
        les4();
        les5();
        les6();
        les7();
    }
    /*
    1. Написать класс, который выводит на экран надпись "Hello,world!"
    */
    public static void les1(){
        System.out.println("Hello,world!");
        System.out.println();
    }

    /*
    2. Напишите класс, который выводит на экран надпись: "H-e-l-l-o-,-f-r-i-e-n-d!"
    */
    public static void les2(){
        System.out.println("H-e-l-l-o-,-f-r-i-e-n-d!");
        System.out.println();
    }

    /*
    3. Напишите класс, который выводит на экран в первой строке три знака "+", во второй - четыре знакак "!",
    в третьей - два знака "?"
    */
    public static void les3() {
        System.out.println("+++");
        System.out.println("!!!!");
        System.out.println("??");
        System.out.println();
    }

    /*
    4. Напишите класс, который выводит на экран тем же количеством команд знаки, которые выводились в задании № 3,
    но все знаки должны выводиться в одной строке.
    */
    public static void les4() {
        System.out.print("+++");
        System.out.print("!!!!");
        System.out.print("??");
        System.out.println();
    }

    /*
    8. Напишите класс, который присваивает переменной х значение 6,
    а затем выводит на экран: в первой строке - это значение, во второй - квадрат этого значения,
    в третьей - куб этого значения.
    */
    public static void les5(){
        int x = 6;
        System.out.println(x);
        System.out.println(x*x);
        System.out.println(x*x*x);
        System.out.println();
    }

    /*
    9. Напишите класс,который присваивает переменной х значение 9, а затем выводит на экран:
    в первой строке - это значение с поясняющей надписью (например, "значение х равно 9"),
    а во второй - квадрат этого значения (тоже с поясняющей надписью).
     */
    public static void les6() {
        int x = 9;
        System.out.println("значение x равно " + x);
        System.out.println("квадрат значения х равен " + (x*x));
        System.out.println();
    }

    /*
    10. Напишите класс, который присваивает двум переменным значения, а затем выводит на экран:
    в первой строке значение обеих переменных (с поясняющими надписями), во второй - произведение этих
    переменных (с поясняющей надписью), в третьей - сумму этих переменных (с поясняющей надписью).
     */
    public static void les7() {
        int x = 5;
        int y = 10;
        System.out.println("значение переменной x: " + x + " значение переменной y: " + y);
        System.out.println("произведение переменных х и y: " + (x*y));
        System.out.println("сумма переменных x и y: " + (x+y));
        System.out.println();
    }

}
