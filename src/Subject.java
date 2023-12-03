import java.util.Scanner;

class Subject {
    private String name;
    private double[] grades;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fillSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grades for subject " + name + ":");
        grades = new double[5];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Enter grade " + (i + 1) + ": ");
                double grade = scanner.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    setGrade(i, grade);
                    break;
                } else {
                    System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                }
            } while (true);
        }
    }

    public double getGrade(int i) {
        if (i >= 0 && i <= 4) {
            return grades[i];
        } else {
            return -1;
        }
    }

    public void setGrade(int i, double grade) {
        if (i >= 0 && i <= 4 && grade >= 0 && grade <= 100) {
            grades[i] = grade;
        } else {
            System.out.println("Invalid index or grade. Please enter valid values.");
            setGrade(i, grade);
        }
    }

    public double getAVG() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / 5;
    }
}