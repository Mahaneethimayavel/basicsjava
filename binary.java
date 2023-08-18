package learnjava;

public class binary {

	void split_digit(int num) {

		int result = 0;
		int i = 0;
		while (num > 0) {
			int rem = num % 10;
			result = result+ rem *find_power(2, i);
			i = i + 1;
			num = num / 10;
		}
		System.out.println(result);
	}

	int find_power(int base, int power) {
		int num = base;
		if (power == 0) {
			return 1;
		} else {
			if (power == 1) {
				return base;
			} else {
				while (power > 1) {
					num = num * base;
					power = power-1;

				}

			}
		}
		return num;
	}

	public static void main(String[] args) {
		binary bd = new binary();
		bd.split_digit(100);

	}
}