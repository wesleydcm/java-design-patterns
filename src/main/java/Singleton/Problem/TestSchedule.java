package Singleton.Problem;

public class TestSchedule {
    public static void main(String[] args) {
        reserveDay("Sunday");
        reserveDay("Monday");

    }

    public static void reserveDay(String day){
        Schedule schedule = new Schedule();
        schedule.occupyDay(day);
        System.out.println("Reserved Day: " + schedule.getAvailableDays());

    }
}
