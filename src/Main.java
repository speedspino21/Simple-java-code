import java.util.Scanner;
public class Main
{


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //scanner
        System.out.println("Enter student number between 0 to 3");//prompting user to enter from 0-3
        int x = in.nextInt();//storing input value
        double[][] Courses={{75.20, 84.60, 72.50, 85.60, 78.00},
                            {65.20, 99.70, 82.00, 90.00, 89.00},
                            {95.20, 84.50, 74.50, 88.00, 90.00}};//declaring array


        System.out.println("The total is " + (Courses[0][x]+Courses[1][x]+Courses[2][x]));//printing out the total and average of students
        System.out.println("The average is " + (Courses[0][x]+Courses[1][x]+Courses[2][x])/3);

    }}