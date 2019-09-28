package programing;

public class EvenOdd {

	public static void evenodd() {
		for (int i = 0; i <= 10; i++)
			if (i > 0) {

				{
					if (i % 2 == 0) {
						System.out.println("Even number " + i);
					} else {
						System.out.println("odd number " + i);
					}
				}
			} else {
				System.out.println("hole Number " + i);
			}
	}

}
