package learnjava;

public class block {
	int x;
	static int y;
	{
		x=5;
	}
	static 
	{
		y=6;
		
	}
	block (int a)
	{
		x=a;
	
	}
	public static void main(String[] args) {
		
		block a1=new block(11);
		block a2=new block(12);
		System.out.println(block.y);
		System.out.println(a1.x);
		System.out.println(a2.x);
		

	}

}
