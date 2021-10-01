package set7.tv;

public class TV {

    private final int MIN_CHANNEL = 1;
    private final int MAX_CHANNEL = 120;

    private int channel = 1;
    private int volumeLevel = 4;
    private boolean on = false;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL) {

        }
    }

}
