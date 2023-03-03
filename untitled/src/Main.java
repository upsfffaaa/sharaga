import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Программа про шараги:\n 1 - Расчет стипендии\n 2 - Лучший препод шараг\n 3 - Ссылка на сайт\n 4 - Выход");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            try {
                choice = scanner.nextInt();
            }
            catch (Exception ex) {
                System.out.println("Введено неверное значение!");
                System.exit(0);
            }
            if (choice == 1) {
                Stipendia stipcalc = new Stipendia();
            }
            else if (choice == 2) {
                Prepod prepod = new Prepod();
            }
            else if (choice == 3) {
                Sharaga link = new Sharaga();
            }
            else if (choice == 4) {
                break;
            }
            else {
                System.out.println("Введено неверное значение!");
                System.exit(0);
            }
        } while (true);
    }
}