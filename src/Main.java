import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] section = new Student[4];

        for (int i = 0; i < section.length; i++) {
            section[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            Scanner scanner = new Scanner(System.in);
            section[i].setName(scanner.nextLine());
            section[i].fillSubjects();
        }

        for (Student student : section) {
            System.out.println("Student: " + student.getName());
            System.out.println("Overall Average: " + student.getOverallAVG());
            System.out.println("-------------");
        }
    }
}