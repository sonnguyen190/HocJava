package main;

public enum WeekDay {
	MON(2),TUE(3),WED(4),THUR(5),FRI(6),SAT(7),SUN(8);
	private int value;
	WeekDay(int value){																				
		this.value=value;
	}
	
	public static WeekDay sjs(int value) {
		for(WeekDay day : WeekDay.values()) {
			if(day.value == value) {
				return day;
			}
		}
		return null;
	}
}

