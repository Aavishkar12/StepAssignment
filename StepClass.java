import java.util.Scanner;

public class StepClass {

    // Q1
    public static void calculateAge() {
        int currentYear = 2024;
        int dateOfBirth = 2000;
        int age = currentYear - dateOfBirth;

        System.out.println("Harry's Age in 2024 is: " + age);
    }

    // Q2
    public static void calculateAverage() {
        int physics = 95;
        int chemistry = 96;
        int maths = 94;

        int average = (physics + chemistry + maths) / 3;
        System.out.println("Sam's average mark in PCM is: " + average);
    }

    // Q3
    public static void kmToMiles() {
        float km = 10.8f;
        float miles = km * 0.62f;

        System.out.printf("The distance %.2f km in miles is %.2f\n", km, miles);
    }

    // Q4
    public static void volumeOfEarth() {
        double radius = 6371.0;

        double volumeInCubicKm = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double volumeInCubicMiles = volumeInCubicKm * 0.239913;

        System.out.printf("The volume of Earth is %.2f cubic km and %.2f cubic miles\n",
                volumeInCubicKm, volumeInCubicMiles);
    }

    // Q5
    public static void calculator() {
        Scanner sc = new Scanner(System.in);

        float number1, number2;

        System.out.print("Enter first number: ");
        number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        number2 = sc.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = 0;

        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not possible.");
        }

        System.out.printf("Addition: %.2f\n", addition);
        System.out.printf("Subtraction: %.2f\n", subtraction);
        System.out.printf("Multiplication: %.2f\n", multiplication);
        System.out.printf("Division: %.2f\n", division);
    }

    // Q6
    public static void triangleArea() {
        Scanner sc = new Scanner(System.in);

        float base, height;

        System.out.print("Enter base in cm: ");
        base = sc.nextFloat();

        System.out.print("Enter height in cm: ");
        height = sc.nextFloat();

        float areaCm = 0.5f * base * height;
        float areaInch = areaCm / 6.4516f;

        System.out.printf("The Area of the triangle in sq inch is %.2f and sq cm is %.2f\n",
                areaInch, areaCm);
    }

    // Q7
    public static void temperatureConversion() {
        Scanner sc = new Scanner(System.in);

        float celsius;

        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextFloat();

        float fahrenheit = (celsius * 9.0f / 5.0f) + 32;

        System.out.printf("Conversion of %.2f Celsius to Fahrenheit is: %.2f\n",
                celsius, fahrenheit);
    }

    // Main method
    public static void main(String[] args) {

        calculateAge();
        calculateAverage();
        kmToMiles();
        volumeOfEarth();

        calculator();
        triangleArea();
        temperatureConversion();
    }
}