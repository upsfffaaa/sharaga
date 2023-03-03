import java.util.Scanner;
public class Prepod {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String surname;
    Prepod() {
        System.out.println("Введите имя и фамилию лучшего препода всех шараг всея Руси:");
        name = scanner.nextLine();
        surname = scanner.nextLine();
        Check(name, surname);
    }
    void Check(String name, String surname) {

        Out(name.equals("Константин") & surname.equals("Дзюба"));
    }
    void Out(boolean check) {
        if (check) {
            System.out.println("Молодец!!! Ты абсолютно прав!");
        }
        else {
            System.out.println(Some());
        }
    }
    String Some() {
        return "ПОМЕР";
    }
}
