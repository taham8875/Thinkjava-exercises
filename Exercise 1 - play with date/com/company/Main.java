package com.company;

import java.util.*;
import java.util.Date;

// Scanner input = new Scanner(System.in);


public class Main {

    public static void main(String[] args) {
        MyDate someDate = new MyDate();

//      displays the date in standard American format; for example: Thursday, July 18, 2019.
        System.out.println(someDate);
        System.out.println(someDate.secondsSinceMidnight());
        System.out.println(someDate.percentageOfDayPassed());
    }
}



