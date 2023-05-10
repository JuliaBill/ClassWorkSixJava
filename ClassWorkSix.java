package basic;

import java.util.Scanner;

public class ClassWorkSix {


        static final Scanner SCANNER = new Scanner(System.in);
        public static void main(String[] args) {
            calculateArea();
        }

        static void calculateArea() {
            System.out.println("Bitte nennen Sie uns eine Form");

            String figure = SCANNER.nextLine();
            if (figure.equals("triangle")) {
                double s = calculateTriangleArea();
                System.out.println("Fläche des Dreiecks ist gleich :" + s );


            } else if (figure.equals("rectangle")){
                double s1= calculateRectangleArea();
                System.out.println("Fläche des Rechtecks ist gleich :" + s1);


            } else if (figure.equals("circle")){
                double s2= calculateCircleArea();
                System.out.println("Fläche des Kreises ist gleich :" + s2);

            }
                else {
                System.out.println("Ihre Angaben sind falsch");
            }


            // if-else
            // площадь круга/прямоугольника/треугольника равна ...
        }

        static double calculateCircleArea() {
            double r = SCANNER.nextDouble();

            return Math.PI * Math.pow(2, r);
        }

    static double calculateTriangleArea() {
        double a = SCANNER.nextDouble();
        double b = SCANNER.nextDouble();
        double c = SCANNER.nextDouble();

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;
    }

    static double calculateRectangleArea() {
        double a = SCANNER.nextDouble();
        double b = SCANNER.nextDouble();

        return a * b;
    }


}