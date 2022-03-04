package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinusTest {

	private List<Double> plusMinus(List<Integer> arr) {
		double zero = 0, positive = 0, negative = 0;

		List<Double> result = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				positive++;
			}

			if (arr.get(i) < 0) {
				negative++;
			}

			if (arr.get(i) == 0) {
				zero++;
			}

		}

		DecimalFormat df = new DecimalFormat("#.######");

		result.add(Double.valueOf(df.format(positive / arr.size())));
		result.add(Double.valueOf(df.format(negative / arr.size())));
		result.add(Double.valueOf(df.format(zero / arr.size())));

		return result;
	}

	@Test
	void plusMinusTest() {
		Assertions.assertEquals(Arrays.asList(0.500000, 0.333333, 0.166667), plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1)));
	}
}
