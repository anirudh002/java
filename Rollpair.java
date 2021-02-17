import java.util.*;

public class Rollpair
{
	public static void main(String []args)
	{
		int rolls = 10000;
		int count = 0;
		Random r=new Random();
		for( int i=0; i<rolls; i++)
		{
			int d1 = r.nextInt(6)+1;
			int d2 = r.nextInt(6)+1;
			if(d1==d2)
				count+=1;
		}
		System.out.println(count);
	}
}