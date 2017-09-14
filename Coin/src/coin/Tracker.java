package coin;

public class Tracker {
	volatile int recordheads=0;
	volatile int recordtails=0;
	// This synchronized method is used to check if a new consecutive heads record has been reached and what tread has set it
	public  synchronized void compareHeads(int arg,String name){
		if(recordheads<arg){
			recordheads=arg;
			System.out.println("Most consecutive heads:"+recordheads+" from "+name);
		}
	}
	// This synchronized method is used to check if a new consecutive tails record has been reached and what tread has set it
	public  synchronized void compareTails(int arg,String name){
		if(recordtails<arg){
			recordtails=arg;
			System.out.println("Most consecutive tails:"+ recordtails+" from "+name);
		}
	}

}
