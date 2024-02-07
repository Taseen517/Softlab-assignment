// SmartTV class implementing the TV interface, representing a TV
// with additional features accessing YouTube.


public class SmartTV implements TV {

    
        private boolean powerOn;
        private int volume;
        private int channel;
    
        public boolean isEnabled() {
            return powerOn;
        }
    
        public void enable() {
            System.out.println("Smart TV is enabled");
        }
    
        public void disable() {
            System.out.println("Smart TV is disabled");
        }
    
        public int getVolume() {
            return volume;
        }
    
        public void setVolume(int volume) {
            this.volume = volume;
            System.out.println("Smart TV volume is set to " + volume);
        }
    
        public int getChannel() {
            return channel;
        }
    
        public void setChannel(int channel) {
            this.channel = channel;
            System.out.println("Smart TV channel is set to " + channel);
        }
    
        public void Youtube() {
            System.out.println("Smart TV is playing YouTube");
        }
    
}
