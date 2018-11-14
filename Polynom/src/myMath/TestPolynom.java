package myMath;

public class TestPolynom {
	public static void main(String[] args) {
		
		test_add();
		test_multiply();
		test_equals();
		test_root();
	}
	
	private static Polynom create_random_polynom(int deg) {
		Polynom ans = new Polynom();
		for(int i=0;i<deg;i++) {
			double a = (Math.random()-0.5)*1000;
			a = (int)a;
			a = a/50;
			Monom tmp = new Monom(a,i);
			ans.add(tmp);
		}
		return ans;
	}
	
	private static void test_equals() {
		Polynom p0 = create_random_polynom(4);
		Polynom p1 = create_random_polynom(5);
		Polynom p0_copy = new Polynom(p0);
		if(p0.equals(p1)) {
			System.err.println(p0+" != "+p1);
			throw new RuntimeException("Error: the Polynoms: "+p0+" and "+p1+"  should NOT be equal!!");		
		}
		if(p0.equals(p1)) {
			System.err.println(p0+" == "+p0_copy);
			throw new RuntimeException("Error: the Polynoms: "+p0+" and "+p0_copy+"  should be equal!!");		
		}
	}
	private static void test_add() {
		Polynom p0 = create_random_polynom(4);
		Polynom p1 = create_random_polynom(5);
		Polynom p2 = new Polynom(p0);
		p2.add(p1);
		System.out.println(p0+" + ");
		System.out.println(p1+" = ");
		System.out.println(p2);
	}
	private static void test_multiply() {
		Polynom p0 = create_random_polynom(2);
		Polynom p1 = create_random_polynom(3);
		Polynom p2 = new Polynom(p0);
		p2.multiply(p1);
		System.out.println(p0+" * ");
		System.out.println(p1+" = ");
		System.out.println(p2);
	}	
	private static void test_root() {
		Polynom p0 = create_random_polynom(2);
		Monom m0 = new Monom(-1000,0);
		Monom m3 = new Monom(1,3);
		p0.add(m0);
		p0.add(m3);
		double root0 = p0.root(0, 100, 0.01);
	}
}
