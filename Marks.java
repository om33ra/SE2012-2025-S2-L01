import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int matrix[][] = new int[n][3];
        
        System.out.println("\tCommand Menu");
        System.out.println("1. add");
        System.out.println("2. update");
        System.out.println("3. average_s");
        System.out.println("4. average");
        System.out.println("5. total");
        System.out.println("6. grades");
        System.out.println("7. exit");

        boolean state = true;
        
        while (state) {
            System.out.print("\nEnter option: ");
            int command = scanner.nextInt();

            if (command == 1) 
                {
                System.out.print("Enter student ID: ");
                int studentId = scanner.nextInt();

                System.out.print("Mathematics: ");
                matrix[studentId - 1][0] = scanner.nextInt();
                
                System.out.print("Physics: ");
                matrix[studentId - 1][1] = scanner.nextInt();

                System.out.print("Chemistry: ");
                matrix[studentId - 1][2] = scanner.nextInt();
            } else if (command == 2) {
                System.out.print("Enter student ID: ");
                int studentId = scanner.nextInt();

                System.out.print("Enter subject ID [1 - Mathematics, 2 - Physics, 3 - Chemistry]: ");
                int subjectId = scanner.nextInt();

                System.out.print("Enter marks: ");
                matrix[studentId - 1][subjectId - 1] = scanner.nextInt();
            } else if (command == 3) {
                System.out.print("Enter subject ID [1 - Mathematics, 2 - Physics, 3 - Chemistry]: ");
                int subjectId = scanner.nextInt();
                double total = 0;

                for (int i = 0; i < n; i++) {
                    total = total + matrix[i][subjectId - 1];
                } 

                double average_s = total / n;
                System.out.println("Average of subject " + subjectId + ": " + average_s);
            } else if (command == 4) {
                System.out.print("Enter student ID: ");
                int studentId = scanner.nextInt();

                int mathematics = matrix[studentId - 1][0];
                int physics = matrix[studentId - 1][1];
                int chemistry = matrix[studentId - 1][2];

                double total = mathematics + physics + chemistry;
                double average = total / 3;
                System.out.println("Average of student " + studentId + ": " + average);
            } else if (command == 5) {
                System.out.print("Enter student ID: ");
                int studentId = scanner.nextInt();

                int mathematics = matrix[studentId - 1][0];
                int physics = matrix[studentId - 1][1];
                int chemistry = matrix[studentId - 1][2];

                double total = mathematics + physics + chemistry;
                System.out.println("Total marks of student " + studentId + ": " + total);
            } else if (command == 6) {
                String[] subjects = {"Mathematics", "Physics", "Chemistry"};
                for (int i = 0; i < n; i++) {
                    System.out.printf("\nStudent %d\n", i + 1);
                    for(int j = 0; j < 3; j++) {
                        System.out.print(subjects[j] + ": ");

                        if (matrix[i][j] >= 90)
                            System.out.print("A\t");
                        else if (matrix[i][j] >= 80)
                            System.out.print("B\t");
                        else if (matrix[i][j] >= 70)
                            System.out.print("C\t");
                        else if (matrix[i][j] >= 60)
                            System.out.print("D\t");
                        else 
                            System.out.print("Fail\t");
                    }
                }
            } else if (command == 7) {
                state = false; 
            } else {
                System.out.print("Invalid option");
            }
        }
    }
}