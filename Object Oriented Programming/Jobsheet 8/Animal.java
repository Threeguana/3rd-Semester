public abstract class Animal {

    private double weight;
    private String food;
    private String habitat;

    public Animal(double weight, String food, String habitat) {
        this.weight = weight;
        this.food = food;
        this.habitat = habitat;
    }

    // Abstract methods (must be implemented by subclasses)
    public abstract void move();

    public abstract void breathe();

    // Common method for all animals
    public void printInfo() {
        System.out.println("Weight   : " + weight + " kg");
        System.out.println("Food     : " + food);
        System.out.println("Habitat  : " + habitat);
    }

    // Getters
    public double getWeight() {
        return weight;
    }

    public String getFood() {
        return food;
    }

    public String getHabitat() {
        return habitat;
    }
}
