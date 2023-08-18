package learnjava;

public class fibonacciseries {

	public static void main(String[] args) {
		fibonacciseries fibo=new fibonacciseries();
		fibo.print_fibo(0,1);
	}
		private void print_fibo (int first, int second)
{
		
			while(first<=13)
			{
				System.out.print(first+"  ");
				
				first=second+first;
				second=first-second;
				
			}
		}

}


