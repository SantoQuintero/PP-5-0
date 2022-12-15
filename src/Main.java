public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Snoop", 51, "Golden Retriever", 160);

        System.out.println("Fang’s breed: " + dog1.getBreed() + "\nFang’s age: " + dog1.getAge());
        System.out.println("Piper’s weight: " + dog2.weightInKilos());
        System.out.println(dog3.toString());
        System.out.println("Number of Dogs: " + Dog.getNumDogs());

    }//end of main
}//end of class