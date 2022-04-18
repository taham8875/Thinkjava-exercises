package com.company;
import java.util.Date;

public class MyDate {
    private int year, month, dayWeek, dayMonth, hour, minute, second;

    public MyDate(){
        Date today = new Date();
        this.year = today.getYear() + 1900;
        this.month = today.getMonth() ;
        this.dayWeek = today.getDay();
        this.dayMonth = today.getDate();
        this.hour = today.getHours();
        this.minute = today.getMinutes();
        this.second = today.getSeconds();
    }


//  displays the date in standard American format; for example: Thursday, July 18, 2019.

    @Override
    public String toString() {

        final String[] DAYS_OF_WEEK = {"Sunday", "Monday", "Tuesday",  "Wednesday", "Thursday", "Friday", "Saturday"};
        final String[] MONTHS_OF_YEAR = {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November","December"};
        return DAYS_OF_WEEK[dayWeek] + ", " + MONTHS_OF_YEAR[month] + " " + String.valueOf(dayMonth)  + ", " + year +". "
                + String.format("%02d:%02d:%02d",hour,minute,second)  ;
    }

    public int secondsSinceMidnight() {
        return hour * 60 * 60 + minute * 60 + second;
    }

    public float percentageOfDayPassed(){
        final int SECONDS_OF_DAY = 86400;
        return (float) this.secondsSinceMidnight() / SECONDS_OF_DAY;
    }
}
