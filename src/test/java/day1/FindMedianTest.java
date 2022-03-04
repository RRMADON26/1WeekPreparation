package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedianTest {

	public static int findMedian(List<Integer> arr) {
		Collections.sort(arr);

		return arr.size()/2;
	}


	@Test
	void findMedianTest() {
		Assertions.assertEquals(3 , findMedian(Arrays.asList(0,1,2,4,6,5,3)));
	}

}
