package heartrate;

import java.util.ArrayList;
import java.util.List;

public class CalculateHeartRate
{

    public static List<HeartIntensityMonitor> calculateForDifferentIntensity(int age, int restingHeartRate)
    {
        List<HeartIntensityMonitor> diffIntesities = new ArrayList<>();
        int heartRate;
        for(int i = 55; i < 96; i += 5){
            int intensity = i;
            heartRate = (((220 - age) - restingHeartRate)* intensity)/100 + restingHeartRate;

            diffIntesities.add(new HeartIntensityMonitor(intensity,heartRate));
        }

        return diffIntesities;
    }
}
