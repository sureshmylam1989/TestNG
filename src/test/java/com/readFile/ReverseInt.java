package com.readFile;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseInt(1534236469));
	}

	// -2147483648
	// 2147483647

	public static int reverseInt(int x) {

		int last = x % 10;
		int rev = 0;
		while (x != 0) {
			last = x % 10;
			if (rev > Integer.MAX_VALUE / 10) {
				return 0;
			} else if (rev == Integer.MAX_VALUE / 10) {
				if (last > 7) {
					return 0;
				}
			}

			if (rev < Integer.MIN_VALUE / 10) {
				return 0;
			} else if (rev == Integer.MIN_VALUE / 10) {
				if (last < -8) {
					return 0;
				}
			}

			rev = rev * 10 + last;
			x = x / 10;
		}
		return rev;

		// int mul = 1;
		// int z = 0;
		// if (x < 0) {
		// mul = -1;
		// z = x;
		// }
		// int y = 0;
		// while (x != 0) {
		// int a = x % 10;
		// x = x / 10;
		// y = y * 10 + a;
		// }
		// return y;
		// if (z < 0) {
		// return y;
		// } else {
		// return y * mul;
		// }
	}

}
