import java.util.*;
public class Transaction implements Comparable<Transaction>
{
	String who;
	SmartDate when;
	double amount;
	
	public Transaction(String who, SmartDate when, double amount)
	{
		this.who = who;
		this.when = when;
		this.amount = amount;
	}
	
	public Transaction(String transaction)
	{}
	
	public String who()
	{
		return who;
	}
	
	public SmartDate when()
	{
		return when;
	}
	
	public double amount()
	{
		return amount;
	}
	
	public String toString() 
	{
		return who + " " + amount + " " + when;
	}
	
	public boolean equals(Object that)
	{
		if (that == null)
		{
			return false;
		}
		
		if (this == that)
		{
			return true;
		}
		
		if (this.getClass() != that.getClass())
		{
			return false;
		}
		
		Transaction other = (Transaction) that;
		return who.compareTo(other.who()) == 0
			&& when.equals(other.when())
			&& amount == other.amount();
	}
	
	public int compareTo(Transaction that)
	{
		return when.compareTo(that.when());
	}
	
	public int hashCode()
	{
		return Objects.hash(who, when, amount);
	}
}