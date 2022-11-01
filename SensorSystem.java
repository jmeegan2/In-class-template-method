import java.util.ArrayList;

public class SensorSystem {
    //Publisher class
    ArrayList< AlarmListener > listeners = new ArrayList();

    void register(AlarmListener alarmListener) {
        listeners.add(alarmListener);
    }

    void soundTheAlarm() {
        //loop through all the listeners/observers in the ArrayList
        for(int i = 0; i < listeners.size(); i++) {
            listeners.get(i).alarm();

        }
    }

}
