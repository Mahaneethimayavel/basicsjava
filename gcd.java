package learnjava;

public class gcd {
	void find_gcd(int no1, int no2) {
	
	int div=2,gcd=0;
	int small=no1<no2?no1:no2;
	while(div<=small) {
		if(no1%div==0&&no2%div==0) {
			gcd=div;
		}
		div++;
	}
	System.out.println(" gcd is "+ gcd);
	
	}
	
	

	public static void main(String[] args) {
	gcd pb=new gcd();
	pb.find_gcd(100,60);
		

	}

}
