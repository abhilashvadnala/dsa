package ctci.stacksNQueues.animalShelter;

public abstract class Animal {

    protected String name;
    private int order;

    public Animal(String name) {
        this.name = name;
    }

    public int getOrder() {
        return this.order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    
    public boolean isOlderThan(Animal animal) {
        return this.order < animal.order;
    }

    public abstract String name();

}
