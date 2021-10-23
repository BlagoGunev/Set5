package set10.fan;

public class FanTests {

    public static void main(String[] args) {

        Fan f1 = new Fan();
        f1.setSpeed("fast");
        f1.setRadius(10.0);
        f1.setColor("yellow");
        f1.setSwitchedOn(true);

        Fan f2 = new Fan();
        f2.setSpeed("medium");
        f2.setRadius(5.0);
        f2.setColor("blue");
        f2.setSwitchedOn(false);

        System.out.println(f1.toString());
        System.out.println(f2.toString());

    }

}
