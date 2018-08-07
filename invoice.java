import java.util.*;
import java.util.Scanner;
class Invoice
{
	private string partno;
	private string partdesc;
	private int qty;
	private double price;
	
	Invoice(String p,String pd,int q,double pr)
	{
		partno=p;
		partdesc=pd;
		qty=q;
		price=pr;
	}
	void setpartno()
	{
		this.partno=partno;
	}
	void setpartdesc()
	{
		this.partdesc=partdesc;
	}
	void setqty()
	{
		this.qty=qty;
	}
	void setprice()
	{
		this.price=price;
	}
	String getpartno()
	{
	return partno;
	}
	String getpartdesc()
	{
	return partdesc;
	}
	int getqty()
	{
	return qty;
	}
	double getprice()
	{
	return price;
	}	
	double getInvoice()
	{
		double amount;
		if(qty<0)
			{
			qty=0;
			}
		
			if(price<0)
			{
				price=0.0;}
			amount=qty*price;
			return amount;
	}
		public static void main(String args[])
		{	
			
			
			Invoice v=new Invoice("1","hello",50,100.0);
			
			am=v.getInvoice();
			System.out.print(am);
		}
}
			
	
