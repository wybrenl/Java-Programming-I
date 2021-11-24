public class Fitbyte {
    private int age; 
    private int targetHeartRate;

    public Fitbyte(int age, int targetHeartRate) {
        this.age = age;
        this.targetHeartRate = targetHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (206.3 - (0.711 * age) - targetHeartRate) * percentageOfMaximum + targetHeartRate;
    }
}
