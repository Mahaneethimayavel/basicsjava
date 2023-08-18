package learnjava;

public class  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int amt =12345666, r2000 = 0, r500 = 0, r200 = 0, r100 = 0, r50 = 0, r20 = 0, r10 = 0, r5 = 0, r2 = 0, r1 = 0, count = 0;
				
		        while (amt >= 2000) {
					r2000 = amt / 2000;
					amt = amt % 2000;
					System.out.println("Total Number Of 2000 Rupees Notes :" + r2000);
				
				}	while (amt >= 500) {
					r500 = amt / 500;
					amt = amt % 500;
					System.out.println("Total Number Of 500 Rupees Notes : " + r500);
				
				}
				while (amt >= 200) {
					r200 = amt / 200;
					amt = amt % 200;
					System.out.println("Total Number Of 200 Rupees Notes : " + r200);
					
				}
				while (amt >= 100) {
					r100 = amt / 100;
					amt = amt % 100;
					System.out.println("Total Number Of 100 Rupees Notes : " + r100);
				
				}

				while (amt >= 50) {
					r50 = amt / 50;
					amt = amt % 50;
					System.out.println("Total Number Of 50 Rupees Notes : " + r50);
					
				}

				while (amt >= 20) {
					r20 = amt / 20;
					amt = amt % 20;
					System.out.println("Total Number Of 20 Rupees Notes : " + r20);
					
				}

				while (amt >= 10) {
					r10 = amt / 10;
					amt = amt % 10;
					System.out.println("Total Number Of 10 Rupees Notes  : " + r10);
					
				}

				while (amt >= 5) {
					r5 = amt / 5;
					amt = amt % 5;
					System.out.println("Total Number Of 5 Rupees Coin : " + r5);

				}

				while (amt >= 2) {
					r2 = amt / 2;
					amt = amt % 2;
					System.out.println("Total Number Of 2 Rupees   Coin : " + r2);

				}

				while (amt >= 1) {
					r1 = amt / 1;
					amt = amt % 1;
					System.out.println("Total Number Of 1 Rupees Coin : " + r1);
				
				}

				count = r2000 + r500 + r100 + r50 + r20 + r10 + r5 + r2 + r1;
				System.out.println("Total Number Of Notes : " + count);
			}
			
			
		


	}


