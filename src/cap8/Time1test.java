package cap8;

public class Time1test {

	public static void main(String[] args) {
		
		Time1 time = new Time1();
		displayTime("After time object is created", time);
		System.out.println();
		
		time.setTime(13, 27, 6);
		displayTime("After call setTime", time);
		System.out.println();
		
		try
		{
			time.setTime(99, 99, 99);
		}
		catch (IllegalArgumentException e) 
		{
			System.out.printf("Execao: %s%n%n", e.getMessage());
		}

		displayTime("After wrong terms setTime", time);
		System.out.println();
	
	}	

	private static void displayTime(String h, Time1 t) {
		System.out.printf("%s%nUniversal time: %s%nStandart time: %s%n", 
				h,t.toUniversalString(),t.toString());
	}
	
}
