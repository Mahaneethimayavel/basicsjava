package learnjava;

public class primenumber {
	int prime_count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      primenumber pp=new primenumber();
      pp.find_primenumber(2);
	}
	
		void find_primenumber(int no) 
		{
			int div=2;
	
			int count=0;
			while(div<=no/2)
			{
				if(no%div==0)
				{
					
					count=count+1;
					
					
				}
				div=div+1;
			
				
			}
			if(count==0)
			{
				System.out.println(no+"prime");
				prime_count=prime_count+1;
			}
			if(prime_count<=20)
			{
				no=no+1;
				find_primenumber(no);
			}
			}
	

}