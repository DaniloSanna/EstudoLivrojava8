package cap8;

public class Time1 {

	private int hour, minute, second;
	
	public void setTime (int hour, int minute, int second) {
		// hour    <0 || hour   >=24
		// || minute  <0 || minute <=60
		// || second  <0 || second <=60
		if (hour<0 || hour>=24 || minute<0 || minute>=60 ||second<0 || second>=60) {
			throw new IllegalArgumentException("Hora, minuto ou segundo incorreto(s) (" + hour + ":" + minute + ":" +second + ")");
		}
	
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	@Override
	public String toString() {
		
		return String.format("%02d:%02d:%02d %s",
		((hour==0 || hour ==12) ? 12: hour%12), 
		minute, second, (hour <12 ? "AM" : "PM"));

	}
	
}
