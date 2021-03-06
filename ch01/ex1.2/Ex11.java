//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
// import edu.princeton.cs.algs4.StdDraw;

public class Ex11
{	
	public static void main(String[] args)
	{
		SmartDate date = new SmartDate(2020, 2, 30);
		System.out.println(date);
	}
}

class SmartDate
{
	private int year;
	private int month;
	private int day;
	
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
}