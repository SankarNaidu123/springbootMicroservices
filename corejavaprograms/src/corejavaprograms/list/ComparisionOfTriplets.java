package corejavaprograms.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparisionOfTriplets {

	public static List<Integer> compare(List<Integer> a, List<Integer> b) {
		int alice = 0, bob = 0;
		for (int i = 0; i < 3; i++) {
			if (a.get(i) > b.get(i)) {
				alice++;
			} else if (a.get(i) < b.get(i)) {
				bob++;
			}
		}
		ArrayList<Integer> res = new ArrayList<>();
		res.add(alice);
		res.add(bob);
		return res;
	}

	public static void main(String[] args) {
		List<Integer> alice = Arrays.asList(3, 2, 6);
		List<Integer> bob = Arrays.asList(2, 3, 6);

		System.out.println(compare(alice, bob));
	}

}
