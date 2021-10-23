package set10.fan;

public class Fan {

    final static int SLOW = 1, MEDIUM = 2, FAST = 3;

    private int speed = SLOW;
    private boolean switchedOn = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() { }

    public String toString() {
        return switchedOn ?
                String.format("speed: %d, color: %s, radius: %f", speed, color, radius) :
                String.format("color: %s, radius: %f, fan is off", color, radius);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        String checker = speed.toLowerCase();
        switch (checker) {
            case "slow" -> this.speed = SLOW;
            case "medium" -> this.speed = MEDIUM;
            case "fast" -> this.speed = FAST;
            default -> System.out.print("Invalid speed.");
        }
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
