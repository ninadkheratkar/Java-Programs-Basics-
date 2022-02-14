import javax.naming.LimitExceededException;

public class Hello_World {
	
	public static void main (String[] args) {
		System.out.println("Hello Ninad");
		
		int myFirstNumber = (5 + 10) + (10*2) ;
		
		int mySecondNumber = 12;
		
		int myThirdNumber = myFirstNumber  * 2;
		
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		
		int myLastOne = 1000 - myTotal;
		
		System.out.println(myTotal);
		
		System.out.println(myLastOne);
	}

}
