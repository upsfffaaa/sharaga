import java.util.Scanner;
public class Sharaga {
    Scanner scanner = new Scanner(System.in);
    private String name;
    Sharaga() {
        System.out.println("Введите название шараги, чтобы получить ссылку на её сайт:");

        name = scanner.nextLine();
        Check(name);
    }
    void Check(String name) {
        if (name.equals("МПТ") | name.equals("MPT") | name.equals("мпт") | name.equals("MPT")) {
            GetLink(name);
        }
        else {
            System.out.println("Плохая шарага, не поступай");
        }
    }
    void GetLink(String name) {
        System.out.println("https://mpt.ru");
    }
}
