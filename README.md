# Java_week_3

Requirements:

[2 points] Create one class (called FitByte - see below for more details) and one other class of your choice (different than the ones we've seen in class or in our course slides), those classes will be in addition to the Program class that contains main! Please read the details below before you start coding! Each of your classes (except Program) should contain:

[2 point] at least 2 private fields, with public getters and setters

[2 point] at least 2 methods (one must return void, one must return some value)

[1 point]  nondefault constructors (that will be used to initialize the fields above with values provided by users of the class)

[1 point]  default constructors (that will be used to initialize the fields above with some fixed values of your choice) 

In main you should:

[1 point] create instances of each class, using the non-default constructors defined above. 

[1 point] call each of the methods from the two classes created above.




For the FitByte class:

The Karvonen method allows you to calculate your target heart rate for physical exercise. The target heart rate is calculated with the formula (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate where the target heart rate is given as a percentage of the maximum heart rate.

For example if a person has a maximum heart rate of 200 a resting heart rate of 50 and a target heart rate of 75% of the maximum heart rate. The target heart rate should be about ((200-50) * (0.75) + 50) = 162.5 beats per minute.

Create an “exercise assistant” class called Fitbyte. Its constructor takes both an age and a resting heart rate as its parameters. The exercise assistant should provide a method TargetHeartRate, which is passed a number of type double as a parameter that represents a percentual portion of the maximum heart rate. The proportion is given as a number between zero and one.

The class should include:

A constructor public Fitbyte(int age, int restingHeartRate)
A method public double TargetHeartRate(double percentageOfMaximum) that calculates and returns the target heart rate.
Use the formula 206.3 - (0.711 * age) to calculate the maximum heart rate. 

Use the formula (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate to calculate the target heart rate.

(Source: https://raisanenmarkus.github.io/csharp/)
