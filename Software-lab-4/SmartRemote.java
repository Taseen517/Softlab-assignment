// SmartRemote class extending the Remote interface
//acts as an adapter between the Remote interface and the specific functionalities of a SmartTV
// It adapts the general remote operations defined in the Remote interface to work specifically with the SmartTV.

public class SmartRemote implements Remote {
    private TV tv;

    public SmartRemote(TV tv) {
        this.tv = tv;
    }
    
    // Implementing methods from the Remote interface

    public void togglePower(){} 

    public void volumeUp(){}

    public void volumeDown(){}
    
    public void channelUp(){
        System.out.println("Channel is going to next");
    }

    public void channelDown(){
        System.out.println("Channel is going to down");
    }
    

     // Additional method specific to SmartRemote for showing YouTube on SmartTV
    public void showYouTube() {
        if (tv instanceof SmartTV) {
            ((SmartTV) tv).Youtube();
        }
    }
    }
    

