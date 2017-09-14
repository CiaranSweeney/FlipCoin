package coin;

public class Coin {
	public static Tracker track;
	/*A program that starts 3 threads that flip coins and checks which thread has the most consecutive heads in row and
	  which thread has the most consecutive tails in a row*/
	public static void main(String args[]){
		track=new Tracker();
		Flip f1=new Flip();
		Flip f2=new Flip();
		Flip f3=new Flip();
		//Start the treads and flip coins
		f1.start();
		f2.start();
		f3.start();
	}

}
