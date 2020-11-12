package collectionsframework.generics;

public class Main {

    public static void main(String[] args) {
        Box<Book, Pencil> box1 = new Box<>(new Book(), new Pencil());
        Box<Glasses, Book> box2 = new Box<>(new Glasses(), new Book());
    }
}
