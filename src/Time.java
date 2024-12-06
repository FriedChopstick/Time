import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * The Time class represents Time.
 * Time is measured in hours, minutes, seconds
 * Variable dc1 is used for formatting with DecimalFormat
 */

public class Time {
    private DecimalFormat dc1 = new DecimalFormat("00");
    private int seconds;
    private int minutes;
    private int hours;

    /**
     * Constructor for the Time class. This creates a new instance of a Time given
     * the below parameters.
     * @param seconds represents seconds of time
     * @param minutes represents  minutes of time
     * @param hours represents hours of time
     */
    public Time(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    /**
     * getSeconds method for the Time class. This method will information of seconds
     * @return returns a int representing seconds of time.
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * getMinutes method for the Time class. This method will information of minutes
     * @return returns a int representing minutes of time.
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * getHours method for the Time class. This method will information of hours
     * @return returns an int representing hours of time.
     */
    public int getHours() {
        return hours;
    }

    /**
     * toString method for the Time class. This method will return a String
     * showing time in military form (00:00:00)
     * @return returns a String in proper military time containing all
     * information about Time
     */
    public String toString() {
        return dc1.format(hours) + ":" + dc1.format(minutes) + ":" + dc1.format(seconds);
    }

    /**
     * tick method for the Time class. This method add one to seconds and update the.
     * information about Time
     */
    public void tick() {
        seconds++;
        check();
    }

    /**
     * check method for the Time class. This method checks the information of seconds,
     * minutes, and hours, and updating if they go above 60,60,24 respectively.
     */
    private void check() {
        // if second is 60
        if (seconds >= 60) {
            int multiplier;
            multiplier = seconds / 60;
            minutes += multiplier;
            seconds -= 60 * multiplier;
        }
        // if minute is 60
        if (minutes >= 60) {
            int multiplier;
            multiplier = minutes / 60;
            hours += multiplier;
            minutes -= 60 * multiplier;
        }
        // if hour is 24
        if (hours >= 24) {
            int multiplier;
            multiplier = hours / 24;
            hours -= 24 * multiplier;
            }
    }

    /**
     * add method for the Time class. This method adds two time objects together with the
     * other clock's information merging with the current time. Then we use check() to update the
     * time.
     * @param otherClock is another time object with information of seconds, minutes, hours
     */
    public void add(Time otherClock) {
        seconds += otherClock.getSeconds();
        minutes += otherClock.getMinutes();
        hours += otherClock.getHours();
        check();
    }
}
