public class Main {

    public static void main(String[] args) {
          // Create instances of SmartTV and GeneralTV
        TV smartTV = new SmartTV();
        TV generalTV = new GeneralTV();
        
       // Both smartremotes can operate on GeneralTV and SmartTV
        Remote smartRemote = new SmartRemote(smartTV);
        smartRemote.channelUp();
        Remote smartRemote2 = new SmartRemote(generalTV);
        smartRemote2.channelDown();

        // Access Youtube() on SmartTV
        SmartTV smartTV2 = new SmartTV();
        smartTV2.Youtube();
    }
    
}
