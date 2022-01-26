package set22.animal;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Wooooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooooooooow");
    }
}
