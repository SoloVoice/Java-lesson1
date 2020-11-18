public class lesson1 {

    public static void main(String[] args) {
        //Задание 1.2
        byte a = 12;
        short b = 10000;
        int c = 120000;
        long d = 1000000L;
        float e = 1.1f;
        double f = 2.22;
        char g = 12556;
        boolean h = true;

        // Задание 1.3
        System.out.println("Задание 1.3");
        float a1 = 10.2f;
        float a2 = 12.3f;
        float a3 = 18.5f;
        float a4 = 21.7f;
        System.out.println("Результат вычислений: " + exercise1p3(a1, a2, a3, a4) + "\n");

        // Задание 1.4
        System.out.println("Задание 1.4");
        int num1 = 10;
        int num2 = 11;
        System.out.println("Число находится в рамках заданного значения: " + exercise1p4(num1, num2) + "\n");

        //Задание 1.5
        System.out.println("Задание 1.5");
        int c1 = 0;
        exercise1p5(c1);

        //Задание 1.6
        System.out.println("Задание 1.6");
        int d1 = -100;
        System.out.println("Число отрицательное: " + exercise1p6(d1) + "\n");

        //Задание 1.7
        System.out.println("Задание 1.7");
        String name = "Сигизмунд";
        exercise1p7(name);

        //Задание 1.8
        System.out.println("Задание 1.8");
        int year = 1769;
        exercise1p8(year);
    }

    static float exercise1p3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean exercise1p4(int a, int b) {
        if (10 <= (a + b) && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void exercise1p5(int a) {
        if (0 <= a) {
            System.out.println("Число положительное\n");
        } else if (a < 0) {
            System.out.println("Число отрицалетное\n");
        }
    }

    static boolean exercise1p6(int a) {
        if (a <= 0) return true;
        return false;
    }

    static void exercise1p7(String a) {
        System.out.println("Пирвет " + a + "!\n");
    }

    static void exercise1p8(int a) {
        if (a % 4 == 0 || a % 400 == 0) {
            System.out.println("Этот год вискокосный");
        } else if (a % 100 == 0) {
            System.out.println("Этот год не является високосным");
        } else {
            System.out.println("Этот год не является високосным");
        }
    }
}
