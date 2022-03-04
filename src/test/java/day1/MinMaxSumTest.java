package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSumTest {
	private String minMaxSum(List<Integer> arr) {

		if (arr.stream().distinct().count() <= 1) {

			return (arr.get(0) * (arr.size() - 1)) + " " + (arr.get(0) * (arr.size() - 1));
		} else {
			List<Long> sum = new ArrayList<>();

			long toAdd = 0;

			for (Integer integer : arr) {

				for (Integer oj : arr.stream().filter(x -> x != integer).collect(Collectors.toList())) {
					toAdd += oj;
				}

				sum.add(toAdd);
				toAdd = 0;

			}

			return Collections.min(sum) + " " + Collections.max(sum);
		}
	}

	@Test
	void minMaxSumTest() {
		Assertions.assertEquals("10 14", minMaxSum(Arrays.asList(1, 2, 3, 4, 5)));
	}
}
