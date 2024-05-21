
public class Phone extends Device {
	public void makeCall(){
        this.battery -= 5;
        System.out.println("You are making a call.");
        	deviceStatus();
        if (this.battery <= 10 ){
            System.out.println("Battery is low");
        }
	}
    public void playGame(){
            	System.out.println("You play a game.");
            	battery -= 20;
            	deviceStatus();
            }
            
    public void charge(){
            	System.out.println("You charge your phone.");
            	battery += 50;
            	deviceStatus();
            }
}

