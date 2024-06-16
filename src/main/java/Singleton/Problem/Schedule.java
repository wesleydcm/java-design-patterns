package Singleton.Problem;

import java.util.HashMap;
import java.util.Map;

public class Schedule {

    private Map<String, Boolean> availableDays = new HashMap<>();

    public Schedule() {
        availableDays.put("Monday", Boolean.TRUE);
        availableDays.put("Tuesday", Boolean.TRUE);
        availableDays.put("Wednesday", Boolean.TRUE);
        availableDays.put("Thursday", Boolean.TRUE);
        availableDays.put("Friday", Boolean.TRUE);
        availableDays.put("Saturday", Boolean.TRUE);
        availableDays.put("Sunday", Boolean.TRUE);
    }

    public Map<String, Boolean> getAvailableDays() {
        return availableDays;
    }

    public void occupyDay(String day) {
        availableDays.replace(day, Boolean.FALSE);
    }


}
