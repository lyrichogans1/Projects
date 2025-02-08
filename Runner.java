import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet pet1 = new Pet();        
        System.out.println(pet1);

        Pet pet2 = new Pet("Dog", "Shadow", 4);
        System.out.println(pet2);

        System.out.println("Enter animal type:");
        String type = scanner.nextLine();
        System.out.println("Enter animal name:");
        String name = scanner.nextLine();
        System.out.println("Enter animal age:");
        int age = scanner.nextInt();

        Pet pet3 = new Pet(type, name, age);
        System.out.println(pet3);

        scanner.close();
    }
}