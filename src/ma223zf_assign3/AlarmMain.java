package ma223zf_assign3;

public class AlarmMain {

	public static void main(String[] args) {
		AlarmClock alarm = new AlarmClock(23, 48); //set time//
		alarm.displayTime(); 
		alarm.setAlarm(6, 15); 
		alarm.displayAlarmTime();
		for (int i = 1; i <= 500; i++) { //display time after 500 minutes//
			alarm.timeTick();
		}
		alarm.displayTime();
	}

}
