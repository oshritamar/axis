import java.util.Random;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem(); //this line displays the initial axis
        drawLineEx6(axisSystem);
    }
    public static void drawPointEx1(AxisSystem axisSystem) {
        axisSystem.addSinglePoint(100, 150, "YELLOW");
    }
    public static void drawPointEx2(AxisSystem axisSystem) {
        axisSystem.addSinglePoint(-200, 200, "RED");
    }
    public static void drawPointEx3(AxisSystem axisSystem) {
        int[] arrayPoints = {50, 50, 60, 60, 70, 70};
        axisSystem.addMultiplePoints(arrayPoints, "BLACK");
    }
    public static void pointBasedOnInput(AxisSystem axisSystem) {
        System.out.println("Enter x value of point:");
        int x = scanner.nextInt();
        System.out.println("Enter y value of point:");
        int y = scanner.nextInt();
        axisSystem.addSinglePoint(x, y, "PINK");
    }
    public static void randomPoints(AxisSystem axisSystem) {
        Random random = new Random();
        System.out.println("how many points would you like to draw?");
        int userChoice = scanner.nextInt();
        System.out.println("pick a color of points");
        String colorChoice = scanner.nextLine();
        if (userChoice == 1) {
            int x = random.nextInt(-250, 250);
            int y = random.nextInt(-250, 250);
            axisSystem.addSinglePoint(x, y, colorChoice);
        } else {
            int[] arr = new int[userChoice];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(-250, 250);
                axisSystem.addMultiplePoints(arr, colorChoice);
            }
        }
    }
    public static void drawLineEx6(AxisSystem axisSystem) {
        for (int i = -250; i < 251; i++) {
            if (2 * i + 100 > -250 && 2 * i + 100 < 251) {
                axisSystem.addSinglePoint(i, 2 * i + 100, "GREEN");
            }
        }
    }
    public static void drawLineEx7(AxisSystem axisSystem){
        System.out.println("enter m for line equasion");
        int m=scanner.nextInt();
        System.out.println("enter n for line equasion");
        int n=scanner.nextInt();
        for (int i = -250; i <251 ; i++) {
            axisSystem.addSinglePoint(i*m,i*m+n,"PINK");

        }
    }
}


