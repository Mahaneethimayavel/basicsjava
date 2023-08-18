package learnjava;

public class 	taxcalculate  {

	public static void main(String[] args) {
		
		taxcalculate taxes=new 	taxcalculate();
		taxes. oldsalarytax(1000000,0);
		taxes.newtaxprevios (1000000,0);
		taxes.newtaxrevised(1000000,0);

	}
	public void oldsalarytax(int salary,double tax)
	{
	if(salary>=0&&salary>=250000)
	{
		tax=0;
	}
	if(salary>=250001&&salary<=500000) 
	{
		tax=(salary-250000)*5.0/100;
	}
	if(salary>=500001&&salary<=1000000) 
	{
		tax=(250000*5.0/100.0)+(salary-500000)*20.0/100;
	}
	if(salary>=1000001)
	{
		tax=(250000*5.0/100.0)+(salary-500000)*20.0/100+(salary)*30.0/100;
	}
	System.out.println(" oldsalarytax =" + tax);
	}
	
	public void newtaxprevios(int salary,double tax1)
	{
		if(salary>=0&&salary<=250000)
		{
			tax1=0;
		}
		if(salary>=250000&&salary<=500000)
		{
			tax1=(salary-250000)*5.0/100;
		}
		if(salary>=500000&&salary<=750000)
        {
        	tax1=(salary-250000)*5.0/100+(salary-500000)*10.0/100;
        }
		if(salary>=750000&&salary<=1000000)
		{
			tax1=(salary-250000)*5.0/100+(salary-500000)*10.0/100+(salary-750000)*15.5/100;
		}
		if(salary>=1000000&&salary<=1250000)
		{
			tax1=(salary-250000)*5.0/100+(salary-500000)*10.0/100+(salary-750000)*15.5/100+(salary-1000000)*20.0/100;
		}
		if(salary>=1250000&&salary<=1500000)
		{
			tax1=(salary-250000)*5.0/100+(salary-500000)*10.0/100+(salary-750000)*15.5/100+(salary-1000000)*20.0/100+(salary-1250000)*25.0/100;
			
		}
		if(salary>=1500001)
		{
			tax1=(salary-250000)*5.0/100+(salary-500000)*10.0/100+(salary-750000)*15.5/100+(salary-1000000)*20.0/100+(salary-1250000)*25.0/100+(salary*30.0/100);
			
		}
		System.out.println(" newtaxprevios =" +tax1);
	}

		public void newtaxrevised(int salary,double tax2)
		{
			if(salary>=0&&salary<=300000)
			{
				tax2=0;
			}
			if(salary>=300000&&salary<=600000)
			{
				tax2=(salary-300000)*5/100;
			}
			if(salary>=600000&&salary<=900000)
			{
				tax2=(salary-300000)*5/100+(salary-600000)*10/100;
			}
			if(salary>=900000&&salary<=1200000)
			{
				tax2=(salary-300000)*5/100+(salary-600000)*10/100+(salary-900000)*15/100;
			}
			if(salary>=1200000&&salary<=1500000)
			{
				tax2=(salary-300000)*5/100+(salary-600000)*10/100+(salary-900000)*15/100+(salary-1200000)*20/100;
			}
			if(salary<=1500000)
			{
				tax2=(salary-300000)*5/100+(salary-600000)*10/100+(salary-900000)*15/100+(salary-1200000)*20/100+salary*30/100;
				
				
			}
			
			System.out.println("  newtaxrevised =" +tax2);	
			
			
				{
					
				}
	}

}
