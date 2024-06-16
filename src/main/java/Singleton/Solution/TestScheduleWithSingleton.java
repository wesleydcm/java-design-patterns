package Singleton.Solution;

import Singleton.Problem.Schedule;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestScheduleWithSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ScheduleSingletonEnum scheduleOne = ScheduleSingletonEnum.getInstance();
        ScheduleSingletonEnum scheduleTwo = ScheduleSingletonEnum.getInstance();

        System.out.println(scheduleOne.hashCode());
        System.out.println(scheduleTwo.hashCode());


//        // Reflection
//        Constructor<ScheduleSingletonEnum> constructorReflection = ScheduleSingletonEnum.class.getDeclaredConstructor();
//        constructorReflection.setAccessible(true);
//        ScheduleSingletonEnum scheduleReflectionOne = constructorReflection.newInstance();
//        ScheduleSingletonEnum scheduleReflectionTwo = constructorReflection.newInstance();
//
//        System.out.println(scheduleReflectionOne);
//        System.out.println(scheduleReflectionTwo);

        reserveDayEnum("Saturday");
        reserveDayEnum("Sunday");


//        ScheduleSingletonLAZY scheduleOne = ScheduleSingletonLAZY.getInstance();
//        ScheduleSingletonLAZY scheduleTwo = ScheduleSingletonLAZY.getInstance();
//
//        System.out.println(scheduleOne);
//        System.out.println(scheduleTwo);
//
//
//        // Reflection
//        Constructor<ScheduleSingletonLAZY> constructorReflection = ScheduleSingletonLAZY.class.getDeclaredConstructor();
//        constructorReflection.setAccessible(true);
//        ScheduleSingletonLAZY scheduleReflectionOne = constructorReflection.newInstance();
//        ScheduleSingletonLAZY scheduleReflectionTwo = constructorReflection.newInstance();
//
//        System.out.println(scheduleReflectionOne);
//        System.out.println(scheduleReflectionTwo);




//        reserveDayLAZY("Sunday");
//        reserveDayLAZY("Monday");



//        ScheduleSingletonEAGER scheduleOne = ScheduleSingletonEAGER.getInstance();
//        ScheduleSingletonEAGER scheduleTwo = ScheduleSingletonEAGER.getInstance();
//
//        System.out.println(scheduleOne);
//        System.out.println(scheduleTwo);
//
//
//        reserveDayEAGER("Sunday");
//        reserveDayEAGER("Monday");


    }

    public static void reserveDayEAGER(String day){
        ScheduleSingletonEAGER schedule = ScheduleSingletonEAGER.getInstance();
        schedule.occupyDay(day);
        System.out.println("Reserved Day: " + schedule.getAvailableDays());

    }

    public static void reserveDayLAZY(String day){
        ScheduleSingletonLAZY schedule = ScheduleSingletonLAZY.getInstance();
        schedule.occupyDay(day);
        System.out.println("Reserved Day: " + schedule.getAvailableDays());
    }

    public static void reserveDayEnum(String day){
        ScheduleSingletonEnum schedule = ScheduleSingletonEnum.getInstance();
        schedule.occupyDay(day);
        System.out.println("Reserved Day: " + schedule.getAvailableDays());
    }
}
