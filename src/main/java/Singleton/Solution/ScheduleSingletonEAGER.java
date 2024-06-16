package Singleton.Solution;

import java.util.HashMap;
import java.util.Map;

public class ScheduleSingletonEAGER {

    private static final ScheduleSingletonEAGER INSTANCE = new ScheduleSingletonEAGER();

    private Map<String, Boolean> availableDays = new HashMap<>();

    private ScheduleSingletonEAGER() {
        availableDays.put("Monday", Boolean.TRUE);
        availableDays.put("Tuesday", Boolean.TRUE);
        availableDays.put("Wednesday", Boolean.TRUE);
        availableDays.put("Thursday", Boolean.TRUE);
        availableDays.put("Friday", Boolean.TRUE);
        availableDays.put("Saturday", Boolean.TRUE);
        availableDays.put("Sunday", Boolean.TRUE);
    }

    public static ScheduleSingletonEAGER getInstance() {
        return INSTANCE;
    }

    public Map<String, Boolean> getAvailableDays() {
        return availableDays;
    }

    public void occupyDay(String day) {
        availableDays.replace(day, Boolean.FALSE);
    }


}
