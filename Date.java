inport java.util.*;
import java.util.Scanner;
import java.util.*;
class Date
{
	 int month;
	 int year;
	int day;
	Date(int x,int y,int z)
	{
	month=x;
	year=y;
	day=z;
	}
	int getyear()
	{
	return this.year;
	}
	int getmonth()
	{
	return this.month;
	}
	int getday()
	{
	return this.day;
	}
	void setyear(int ye)
	{
	this.year=ye;
	}
	void setmonth(int mn)
	{
	this.month=mn;
	}
	void setday(int da)
	{
	this.day=da;
	}
	void setDate(int a,int b,int c)
	{
	month=a;
	year=b;
	day=c;
	}
	String toString()
	{
	System.out.print(month+"/"+day+"/"+year+"/");
	return '1';
	}
}
class test2{
	public static void main(String args[])
	{
		Date d=new Date('09','13','1998');
		d.toString();
	}
}
		
		