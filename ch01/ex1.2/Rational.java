//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
// import edu.princeton.cs.algs4.StdDraw;

public class Rational
{	
	private final long numerator;
	private final long denominator;
	
	public Rational(long numerator, long denominator)
	{
		long greatestCommonDivisor = gcd(numerator, denominator);
		this.numerator = numerator / greatestCommonDivisor;
		this.denominator = denominator / greatestCommonDivisor;
	}
	
	public long getNumerator()
	{
		return numerator;
	}
	
	public long getDenominator()
	{
		return denominator;
	}
	
	public Rational plus(Rational b)
	{
		long numerator = this.numerator * b.getDenominator() + this.denominator * b.getNumerator();
		long denominator = this.denominator * b.getDenominator();
		return new Rational(numerator, denominator);
	}
	
	public Rational minus(Rational b)
	{
		long numerator = this.numerator * b.getDenominator() - this.denominator * b.getNumerator();
		long denominator = this.denominator * b.getDenominator();
		return new Rational(numerator, denominator);
	}
	
	public Rational times(Rational b)
	{
		long numerator = this.numerator * b.getNumerator();
		long denominator = this.denominator * b.getDenominator();
		return new Rational(numerator, denominator);
	}
	
	public Rational divides(Rational b)
	{
		long numerator = this.numerator * b.getDenominator();
		long denominator = this.denominator * b.getNumerator();
		return new Rational(numerator, denominator);
	}
	
	public boolean equals(Rational that)
	{
		if (that == null)
		{
			return false;
		}
		if (that == this)
		{
			return true;
		}
		if (this.getClass() != that.getClass())
		{
			return false;
		}
		Rational another = (Rational) that;
		return numerator == another.getNumerator()
			&& denominator == another.getDenominator();
	}
	public static long gcd(long a, long b)
	{
		if (a % b == 0)
		{
			return b;
		}
		return gcd(b, a % b);
	}
	
	public String toString()
	{
		return numerator + " / " + denominator; 
	}
}
