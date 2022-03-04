package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LonelyIntegerTest {
	private int lonelyInteger(List<Integer> integers) {
		int result = 0;
		for (int i = 0; i < integers.size(); i++) {

			result ^= integers.get(i);
			System.out.println(result);

		}
		return result;
	}

	@Test
	void lonelyIntergerTest() {
		Assertions.assertEquals(4, lonelyInteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
	}
}
