package myMath;

public class Tes_main {
	public static void main(String[] args) {
		Polynom p3=new Polynom();
		p3.add(new Monom(2,8));
		p3.add(new Monom(2,7));
		p3.add(new Monom(2,6));
		p3.add(new Monom(2,5));
		System.out.println(p3.toString());
		double _coefficient1 = Math.random()*30 ;
		int _pow1 = (int)(Math.random()*10) ;
		double _coefficient2 = Math.random()*30 ;
		int _pow2 = (int)(Math.random()*10) ;
		double _coefficient3 = Math.random()*30 ;
		int _pow3 = (int)(Math.random()*10);
		String s = "" + _coefficient3 + "X^" + _pow3 + " + " + _coefficient2 + "X^" + _pow2 + " + " + _coefficient1 + "X^" + _pow1 ;
		Polynom p = new Polynom("" + _coefficient1 + "X^" + _pow1 + " + " + _coefficient2 + "X^" + _pow2 + " + " + _coefficient3 + "X^" + _pow3 );
		System.out.println(p.toString());
		Graph g=new Graph(p,-10,10);
		g.setVisible(true);
	}
}


