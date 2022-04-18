import java.util.Scanner;

public class ClassFeb9 {

    public static void printGrade2(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        int [] grades = new int[num];

        while(i < num){
            System.out.print("Enter student grade: ");
            int grade = scanner.nextInt();

            while(grade < 0 || grade > 100){
                System.out.print("Enter again: ");
                grade = scanner.nextInt();
            }
            
            grades[i] = grade;
            min = Math.min(grade, min);
            max = Math.max(grade, max);
            sum += grade;
            i++;
        }

        System.out.println("The minimum grade in the class is: " + Integer.toString(min));
        System.out.println("The maximum grade in the class is: " + Integer.toString(max));

        double average = (double) sum / num;

        System.out.println("The average grade in this class is: " + Double.toString(average));

        scanner.close();
    }
    
    public static void main(String[] args) {
        
    }
}
