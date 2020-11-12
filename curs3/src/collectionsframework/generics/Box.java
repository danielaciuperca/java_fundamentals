package collectionsframework.generics;

public class Box<E, T> {    //clasa generica cu tipul generic E
    private E element1;
    private T element2;

    public Box(E element1, T element2) {
        this.element1 = element1;
        this.element2 = element2;
    }

    public E print(E anotherElement, T otherElement) {
        return this.element1;
    }
}
