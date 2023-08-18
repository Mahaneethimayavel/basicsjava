package learnjava;

public class fizzbuzz {

	public static void main(String[] args) {
		int num=1;
		while(num<=50)
		{
			System.out.println(num);
			num=num+1;
			
			if(num%3==0)
				
			{
				System.out.println("fizz");
			}
			if(num%5==0)
			{
				System.out.println("buzz");
			}
			if(num%3==0&&num%5==0)
			{
				System.out.println("fizz buzz");
			}
		}

	}

}
