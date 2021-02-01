package ctci.stacksNQueues.animalShelter;

import java.util.LinkedList;

public class AnimalShelter {

    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;
        if(animal instanceof Dog) dogs.addLast((Dog)animal);
        if(animal instanceof Cat) cats.addLast((Cat)animal);
    }

    public Animal dequeueAny() {
        if(dogs.size() == 0) return dequeueCat();
        else if(cats.size() == 0) return dequeueDog();
        Dog d = dogs.peek();
        Cat c = cats.peek();
        if(d.isOlderThan(c)) {
            return d;
        } else {
            return c;
        }
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }
    
}
