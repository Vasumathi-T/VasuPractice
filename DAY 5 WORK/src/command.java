import java.util.*;

public class command {
	int p;

	public static void main(String[] args) {
		command c=new command();
		if(args.length>0)
		{
			int n=Integer.parseInt(args[0]);
			c.prime(n);
			c.evenodd(n);
			c.palindrom(n);
			c.perfect(n);
			c.armstrong(n);
		}
		else
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter value: ");
			c.p=s.nextInt();
			//s.nextLine();
			c.prime(c.p);
			c.evenodd(c.p);
			c.palindrom(c.p);
			c.perfect(c.p);
			c.armstrong(c.p);
		}

	}
	public void prime(int a)
	{
		int flag=0;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				flag++;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==0)
				System.out.println("prime");
		else
				System.out.println("Not");
	}
	public void evenodd(int b)
	{
		if(b % 2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	public void palindrom(int m)
	{
		int rem,n=m,r=0;
		while(n!=0)
		{
			rem=n%10;
			r=r*10+rem;
			n=n/10;
			
		}
		if(m==r)
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
		
	}
	public void perfect(int per)
	{
		int i=1,sum=0;
		while(i<=per/2)
		{
			if(per%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(per==sum)
			System.out.println("perfect");
		else
			System.out.println("Not perfect");
		
	}
	public void armstrong(int arm)
	{
		int r=arm;
		int rem=0;
		int last;
		while(arm>0)
		{
			last=arm%10;
			rem=rem+(last*last*last);
			arm=arm/10;
		}
		if(r==rem)
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
	}
}


