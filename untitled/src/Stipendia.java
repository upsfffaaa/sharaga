import java.util.Scanner;
public class Stipendia {
    Scanner scanner = new Scanner(System.in);
    private double kurs = 0;
    private double ball = 0;
    private double stip = 0;
    Stipendia() {
        System.out.println("Введите курс и средний балл");
        try {
            kurs = scanner.nextDouble();
            ball = scanner.nextDouble();
        }
        catch (Exception ex) {
            System.out.println("Введено неверное значение!");
            System.exit(0);
        }
        Check(kurs, ball);
    }
    void Check(double kurs, double ball) {
        if (kurs < 1 ) {
            System.out.println("Курс не может быть < 1");
        }
        else if (kurs > 4) {
            System.out.println("Курс не может быть > 4");
        }
        else if (ball > 5) {
            System.out.println("Балл не может быть > 5");
        }
        else if (ball < 2) {
            System.out.println("Балл не может быть < 2");
        }
        else {
            if(ball<3.5) {
                System.out.println(Noob());
            }
            else {
                String result = Calculator(kurs, ball);
                System.out.println(result);
            }
        }
    }
    String Noob() {
        return "Какая стипендия!? ИДИ УЧИСЬ!!!";
    }
    String Calculator(double Kurs, double Ball) {
        try {
            stip = Kurs * 500 * Ball;
            System.out.println("Ваша стипендия: " + stip);
        }
        catch (Exception ex) {
            System.out.println("Ошибка в вычислениях!");
        }
        return  "Но в мпт вы получите: 690 )))";
    }
}
