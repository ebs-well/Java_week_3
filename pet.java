enum Type {Dog, Cat, Fish, Bird, TIGER};

public class pet {
    public String ownerName;
    public Type animal;
    private String petName;
    private String petColor;

    //Setter

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    //Getter

    public String getPetName() {
        return petName;
    }

    public String getPetColor() {
        return petColor;
    }

    //Methods

    public String toString()
    {
        return petName + " is a " + petColor + " " + animal + " that belongs to " + ownerName;
    }

    public void adoptionTime(String ownerName) // This allows use to change the name of any pet that gets adopted from the shelter
    {
        this.ownerName = ownerName;
    }

    //Constructor

    public pet() // Standard build for our pets, information used is from my pet
    {
        ownerName = "unspecified";
        animal = Type.Dog;
        petName = "Bianca";
        petColor = "White";
    }

    public pet(String ownerName, Type someType, String petName, String petColor) // Constructor overload allowing us to build our pets on the fly 
    {
        this.ownerName = ownerName;
        animal = someType;
        this.petName = petName;
        this.petColor = petColor;
    }

}
