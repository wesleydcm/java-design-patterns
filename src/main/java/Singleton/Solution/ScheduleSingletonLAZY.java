package Singleton.Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ScheduleSingletonLAZY {

    private static ScheduleSingletonLAZY INSTANCE;

    private Map<String, Boolean> availableDays = new HashMap<>();

    private ScheduleSingletonLAZY() {
        availableDays.put("Monday", Boolean.TRUE);
        availableDays.put("Tuesday", Boolean.TRUE);
        availableDays.put("Wednesday", Boolean.TRUE);
        availableDays.put("Thursday", Boolean.TRUE);
        availableDays.put("Friday", Boolean.TRUE);
        availableDays.put("Saturday", Boolean.TRUE);
        availableDays.put("Sunday", Boolean.TRUE);
    }

    public static ScheduleSingletonLAZY getInstance() {
        if(Objects.isNull(INSTANCE)) {
            INSTANCE = new ScheduleSingletonLAZY();
        }
        return INSTANCE;
    }

    public Map<String, Boolean> getAvailableDays() {
        return availableDays;
    }

    public void occupyDay(String day) {
        availableDays.replace(day, Boolean.FALSE);
    }


}
