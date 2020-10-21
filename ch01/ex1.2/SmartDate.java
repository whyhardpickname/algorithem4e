package ex1_1;
import java.util.*;
enum Weekday
{
	Monday, Tuesday, Wednesday, 
	Thursday, Friday, Saturday, Sunday; 
}
public class SmartDate
{
	private int year;
	private int month;
	private int day;
	
	public SmartDate(String s)
	{
		String[] date = s.split("/");
		year = Integer.parseInt(date[0]);
		month = Integer.parseInt(date[1]);
		day = Integer.parseInt(date[2]);
	}
	public SmartDate(int year, int month, int day)
	{
		if (year < 0) 
		{
			throw new IllegalArgumentException("year must morethan zero.");
		}
		if (!isValidMonth(month))
		{
			throw new IllegalArgumentException("month must between 1 and 12.");
		}
		if (!isValidDayOfMonth(month, day))
		{
			throw new IllegalArgumentException("day must greater than 0 and less or equals 28, 30 ro 31.");
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public boolean isLeapYear(int year)
	{
		if (year < 0)
		{
			return false;
		}
		
		if (year % 400 == 0 || year % 4 == 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isValidMonth(int month)
	{
		return month > 0 && month <= 12;
	}
	
	public boolean isValidDayOfMonth(int month, int day)
	{
		if (!isValidMonth(month))
		{
			return false;
		}
		int[] dayOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear(year))
		{
			dayOfMonths[1]++;
		}
		if (day < 1 || day > dayOfMonths[month - 1])
		{
			return false;
		}
		return true;
 	}
	public int day()
	{
		return day;
	}
	
	public int month()
	{
		return month;
	}
	
	public int year()
	{
		return year;
	}
	
	public String toString()
	{
		return year + "/" + month + "/" + day;
	}
	public Weekday dayOfTheWeek()
	{
		int weekday = (day + 2 * month + 3 * (month + 1) / 5 + year
			+ year / 4 - year / 100 + year / 400 + 1) % 7;
		switch(weekday)
		{
			case 0 : 
				return Weekday.Sunday;
			case 1 : 
				return Weekday.Monday;
			case 2 : 
				return Weekday.Tuesday;
			case 3 : 
				return Weekday.Wednesday;
			case 4 : 
				return Weekday.Thursday;
			case 5 : 
				return Weekday.Friday;
			case 6 : 
				return Weekday.Saturday;
		}
		return Weekday.Monday;
	}
	
	public boolean equals(Object otherObject)
	{
		if (otherObject == null)
		{
			return false;
		}
		
		if (this == otherObject)
		{
			return true;
		}
		
		if (this.getClass() != otherObject.getClass())
		{
			return false;
		}
		
		SmartDate other = (SmartDate) otherObject;
		
		return year == other.year() && month == other.month() 
			&& day == other.day();
	}
	
	public int compareTo(SmartDate other)
	{
		if (year != other.year())
		{
			return year - other.year;
		}
		if (month != other.month())
		{
			return month - other.month;
		}
		return day - other.day;
	}
	
	public int hashCode()
	{
		return Objects.hash(year, month, day);
	}
}