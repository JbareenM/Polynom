package myMath;

public class Test {
	public static void main(String[] args) {
		Polynom p=new Polynom();
	 	p.add(new Monom(2,8));
	 	p.add(new Monom(2,7));
	 	p.add(new Monom(2,6));
	 	p.add(new Monom(2,5));
	 	p.add(new Monom(2,4));
	 	p.add(new Monom(2,3));
	 	Graph frame = new Graph(p,-5,5);
        frame.setVisible(true);
	}
}
