public class FitByte { 
    public String name;
    private int age;
    private int restingHeartRate;

    //Setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setRestingHeartRate(int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
    }

    //Getter

    public int getAge() {
        return age;
    }

    public int getRestingHeartRate() {
        return restingHeartRate;
    }

    // method
    public double TargetHeartRate(double targetPercentHeartRate) // Assigned formula for HW that gives us a target heart rate based on our desired percentage
    {
        double maxHeartRate = 206.3 - (0.711 * age);

        double targetHeartRate = (maxHeartRate - restingHeartRate) * (targetPercentHeartRate * 0.01 ) /*this allows the use to just input a int value and we do the math on the backend */ + restingHeartRate;
    
        return targetHeartRate;
    }

    public String toString()
    {
        return name + " is: " + age + " years old and they have a resting heart rate of: " + restingHeartRate;
    }

    // Constructor
    public FitByte() // Basic builder for our client
    {
        name = "John Doe";
        age = 30;
        restingHeartRate = 60;
    }

    public FitByte(String name, int age, int restingHeartRate) // Creating one with unique details in our one line of code
    {
        this.name = name;
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
}
