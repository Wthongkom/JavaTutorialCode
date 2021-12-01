package BooleanInJava;
public class BooleanInJava {

	public static void main(String[] args) {
		
		//int a = 0;
		//boolean b = (a == 0);
		
		//System.out.println(b);

		boolean passDoor = true;
		boolean missDoor = false;
		boolean passedAllDoor = false;
		int doorCount = 0;
		
		if(passDoor) { 
			System.out.println("We passed the first door!");
			doorCount = doorCount +1;
		}
		
		if(passDoor) { 
			System.out.println("We passed the second door!");
			doorCount = doorCount +1;
		}
		
		if(passDoor) { 
			System.out.println("We passed the third door!");
			doorCount = doorCount +1;
		}
		
		if(doorCount == 3) {
			passedAllDoor = true;
		}
		
		if(passedAllDoor) {
			System.out.println("Congratualions you won the program!");
		}
				 
		
	}

}
