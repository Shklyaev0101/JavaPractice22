package JavaPractice;

public class Cycles {

    public static void main(String[] args) {
        cycleOne();
        cycleTwo();
        cycleThree();
    }

    public static void cycleOne() {
        System.out.println('*');
        System.out.println(' ');
    }

    public static void cycleTwo() {
        for (int j = 0; j < 10; j++) {
            System.out.println('*');
            System.out.println(' ');
        }
    }

    public static void cycleThree() {
        for (int j = 0; j < 10; j++) {
            System.out.print('*');
        }
        System.out.println();
        System.out.println(' ');
    }

}
