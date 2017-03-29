package heartrate;

import java.util.List;
import java.util.Scanner;

public class HeartRateCalculator {

    public static void main(String[] args) {
        HeartRateCalculator calculator = new HeartRateCalculator();
        calculator.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter resting heart rate: ");
        int restingHeartRate = scanner.nextInt();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        List<HeartIntensityMonitor> heartIntensities = CalculateHeartRate.calculateForDifferentIntensity(age, restingHeartRate);

        System.out.printf("Age: %s, Resting heart rate: %s\n", age, restingHeartRate);

        System.out.printf("Intensity\t|     Heart rate\n");
        System.out.println("------------|------------");

        for (HeartIntensityMonitor heartIntensity : heartIntensities) {
            System.out.println(heartIntensity.getIntensity() + "%\t\t\t|     " + heartIntensity.getRestingHeartRate());
        }


    }
}
