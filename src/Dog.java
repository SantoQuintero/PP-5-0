public class Dog {
    private String name;
    private int age;
    private String breed;
    private int weight;
    private static int numDogs;

    //creates a dog object fully
    public Dog(String name, int age, String breed, int weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        numDogs++;
    }//end of constructor full

    //creates a dog object empty
    public Dog()
    {
        this.name = "";
        this.age = -1;
        this.breed = "";
        this.weight = -1;
        numDogs++;
    }//end of constructor empty

    //returns name
    public String getName()
    {
        return name;
    }//end of getName

    //returns age
    public int getAge()
    {
        return age;
    }//end of getAge

    //returns breed
    public String getBreed()
    {
        return breed;
    }//end of getBreed

    //returns weight
    public int getWeight()
    {
        return weight;
    }//end of getWeight

    //returns numDogs
    public static int getNumDogs()
    {
        return numDogs;
    }//end of numdogs getter

    //sets name
    public void setName(String name)
    {
        this.name = name;
    }//end of setName

    //sets age
    public void setAge(int age)
    {
        this.age = age;
    }//end of setAge

    //sets weight
    public void setWeight(int weight)
    {
        this.weight = weight;
    }//end of setWeight

    //returns weight in kilos
    public double weightInKilos()
    {
        return weight*0.453592;
    }//end of weight in kilos

    //returns the dog information in a string
    public String toString()
    {
        return "Name: " + name + "\nAge: " + age + "\nBreed: " + breed + "\nPounds: " + weight;
    }//end of toString

}//end of class
