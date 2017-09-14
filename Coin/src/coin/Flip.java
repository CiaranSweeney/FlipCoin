package coin;

import java.util.Random;

public class Flip extends Thread {
	public Random random=new Random();
	private int heads=0;
	private int tails=0;
	//This thread flips a coin and see how many consecutive heads and tails take place
	public void run(){
		// 1000 flips will of the coin will be made
		for(int i=0; i<1000; i++){
			//flip is done here
			boolean flipResult=random.nextBoolean();
			//heads = true
			if(flipResult){
				tails=0;
				heads++;
				//checks to see if this is now the most consecutive heads
				Coin.track.compareHeads(heads,this.getName());
			}
			////tails=false
			else{
				heads=0;
				tails++;
				//checks to see if this is now the most consecutive tails
				Coin.track.compareTails(tails,this.getName());
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("finished "+ this.getName());
	}

}
