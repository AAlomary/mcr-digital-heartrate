package heartrate;

public class HeartIntensityMonitor {
    private int intensity;
    private int restingHeartRate;

    public HeartIntensityMonitor(int age, int restingHeartRate)
    {
        this.intensity = age;
        this.restingHeartRate = restingHeartRate;
    }

    public int getIntensity()
    {
        return intensity;
    }

    public int getRestingHeartRate()
    {
        return restingHeartRate;
    }
}
