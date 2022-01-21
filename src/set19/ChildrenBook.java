package set19;

public class ChildrenBook extends Book{

    private int age;

    /**
     * Creates a new instance of Book
     *
     * @param regularPrice
     * @param publisher
     * @param yearPublished
     * @param age
     */
    public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
        super(regularPrice, publisher, yearPublished);
        this.age = age;
    }

    public double computeSalePrice() {
        return super.getRegularPrice() * 0.3;
    }
}
