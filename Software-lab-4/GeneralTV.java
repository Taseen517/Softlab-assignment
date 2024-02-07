
// GeneralTV class implementing the TV interface, representing a basic TV without smart features.
public class GeneralTV implements TV {

    private boolean powerOn;
    private int volume;
    private int channel;

    public boolean isEnabled() {
        return powerOn;
    }

    public void enable() {
        System.out.println("General TV is enabled");
    }

    public void disable() {
        System.out.println("General TV is disabled");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("General TV volume is set to " + volume);
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("General TV channel is set to " + channel);
    }
}

