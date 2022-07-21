package JavaPractice;

public class Cycles {

    public static void main(String[] args) {
        cycleOne();
        cycleTwo();
        cycleThree();
        cycleFour();
        cycleFive();
        cycleSix();
        cycleSeven();
        cycleEight();
        cycleNine();
        cycleTen();
        //cycleEleven();

    }

    public static void cycleOne() {
        System.out.println('*');
        System.out.println(' ');
    }

    public static void cycleTwo() {
        for (int j = 0; j < 10; j++) {
            System.out.println('*');
        }
        System.out.println(' ');
    }

    public static void cycleThree() {
        for (int j = 0; j < 10; j++) {
            System.out.print('*');
        }
        System.out.println();
        System.out.println(' ');
    }

    public static void cycleFour() {            //оборачиваем код еще в один цикл
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println(' ');
    }

    public static void cycleFive() {            //двойной цикл печатает таблицу из "*" размером 6х6, с пробелом между
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(' ');
    }

    public static void cycleSix() {             //правая часть таблицы должна состоять из " 0 "
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println(' ');
    }

    public static void cycleSeven() {           //сделать так, чтоб по краям квадрата стоял "0", а внутри " * "
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println(' ');
    }

    public static void cycleEight() {           //таблица в шахматном порядке
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public static void cycleNine() {            //половина таблицы 0, вторая половина * и разделить половины диагональю
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > j ) {
                    System.out.print("0 ");
                } else if (i < j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public static void cycleTen() {               //сделать так чтоб по краям квадрата стоял " * " а в середине пусто
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    /*
    public static void cycleEleven() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.println(" ");
                }
            }
        }
    }
    */
}
