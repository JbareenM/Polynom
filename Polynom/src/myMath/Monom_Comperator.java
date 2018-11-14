package myMath;

import java.util.Comparator;

public class Monom_Comperator implements Comparator<Monom> {

	// ******** add your code below *********
	@Override
	public int compare(Monom m0, Monom m1) {
		return m1.get_power() - m0.get_power();
	}
}
