import java.lang.reflect.RecordComponent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        createPerson(scanner);

        Person p1 = new Person("Christian", 35);
        var comp = p1.getClass().getRecordComponents();
        for (RecordComponent component : comp) {
            System.out.print(" "+component);
        }

    }

    public static void createPerson(Scanner scan) {
        System.out.println("Type in your name: ");
        String name = scan.next();
        System.out.println("Type in your age: ");
        int age = scan.nextInt();

        Person person = new Person(name, age);
        System.out.println(person);
    }
}
