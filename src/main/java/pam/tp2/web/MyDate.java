package pam.tp2.web;

import java.io.Serializable;
import java.util.Calendar;

public class MyDate {
	int day;
	int month;
	int year;
	int hour;
	int minute;
	int seconde;
	long mili;
	
	public MyDate() {
		day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		month =  Calendar.getInstance().get(Calendar.MONTH);
		year =  Calendar.getInstance().get(Calendar.YEAR);
		hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		minute = Calendar.getInstance().get(Calendar.MINUTE);
		seconde = Calendar.getInstance().get(Calendar.SECOND);
		mili =  Calendar.getInstance().getTimeInMillis();
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getMili() {
		return mili;
	}

	public void setMili(long mili) {
		this.mili = mili;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconde() {
		return seconde;
	}

	public void setSeconde(int seconde) {
		this.seconde = seconde;
	}
	
	
}
