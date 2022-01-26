package set19;

public class TestProgram {

    public static void main(String[] args) {
        ChildrenBook childrenBook = new ChildrenBook(15, "PW press", 1987, 8);
        ComicBook comicBook = new ComicBook(14, "PW press", 1924, "Batman");

        System.out.println("Comic sale: " + comicBook.computeSalePrice());
        Book book = comicBook;
        System.out.println("Comic polymorph sale: " + book.computeSalePrice());

        System.out.println("Children sale: " + childrenBook.computeSalePrice());
        book = childrenBook;
        System.out.println("Children polymorph sale: " + book.computeSalePrice());
    }

}
