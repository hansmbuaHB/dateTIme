package com.company;

public class TimeClass {
    private int minute;
    private int second;
    private int hours;

    public TimeClass() {
        this(0, 0, 0);
    }

    public TimeClass(int hours) {
        this(hours, 0, 0);
    }

    public TimeClass(int hours, int minute) {
        this(hours, minute, 0);
    }

    public TimeClass(int hours, int minute, int second) {
        setTime(hours, second, minute);
    }

    public TimeClass(TimeClass timeClass) {
        this(timeClass.getHours(),timeClass.getMinute(),timeClass.getSecond());
    }


    public void setTime(int hours, int second, int minute) {

//        if ((hours >= 0 && hours < 24) && (minute >= 0 && minute < 60) && (second <= 0 && second < 60)) {
        this.hours = hours;
        this.minute = minute;
        this.second = second;
//        } else {
//            throw new IllegalArgumentException("house, minutes, seconds are out of rang ");
//        }

    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("hours out of range  ");

        }


    }

    public void setMinute(int minute) {
        //pre: minute is not equal to 0
        if (minute >= 0 && minute < 60) {
            this.minute = minute;

        } else {
            throw new IllegalArgumentException("minute out of range  ");
        }

    }

    public void setSecond(int second) {
        if (second <= 0 && second < 60) {
            this.second = second;


        } else {
            throw new IllegalArgumentException("seconds out of range  ");
        }

    }

    public int getHours() {
        return hours;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //conveting strings to a certain format
    public String toUniversalStrings() {

        return String.format("%02d:%02d:%02d", getHours(), getMinute(), getSecond());

    }


    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHours() == 0 || getHours() == 12) ? 12 : getHours() % 12), getMinute(), getSecond(), (getHours() < 12 ? "12" : "PM"));
    }
}
