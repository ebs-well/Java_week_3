public class Program {
    public static void main(String[] args) {

        pet pet1 = new pet(); // Creating a new pet with default values

        pet pet2 = new pet("Mike Tyson", Type.TIGER, "CUJO", "Orange and Black"); // Creating a pet for Iron Mike Tyson
        
        FitByte JohnDoe = new FitByte(); // Creating a person to use our FitByte calculator with default values

        FitByte JaneSmith = new FitByte("Jane Smith",67, 75); // Creating a person to use our FitByte calculator who wants to stay health in their older age

        System.out.println(pet1); // Simple print to make sure pet1 was made
        System.out.println(pet2); // Simple print to make sure pet2 was made

        pet1.adoptionTime("Francis"); // Pet 1 has been adopted by Francis! YAY

        System.out.println(pet1); // Simple print to make sure pet1 update was successful

        System.out.println(JohnDoe); // Simple print to make sure JohnDoe was made
        double jdTarget = Math.round(JohnDoe.TargetHeartRate(75)); // Running their information through our method for FitByte.java file
        System.out.println("His target heart is " + jdTarget + " at 75% of max heart rate"); // Print out to help identify everything worked

        System.out.println(JaneSmith); // Simple print to make sure JaneSmith was made
        double jsTarget = Math.round(JaneSmith.TargetHeartRate(75)); // Running their information through our method for FitByte.java file
        System.out.println("Her target heart is " + jsTarget + " at 75% of max heart rate"); // Print out to help identify everything worked
                
    }
    
}