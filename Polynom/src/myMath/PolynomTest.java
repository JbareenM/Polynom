package myMath;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class PolynomTest {

	@Test
	void testPolynom() {
		Polynom p = new Polynom();
		if(!p.isZero())
			fail("Eror , Empty Polynom");
	}


	@Test
	void testPolynomString() {
		double _coefficient1 = Math.random()*1000 ;
		int _pow1 = (int)(Math.random()*10) +24 ;
		double _coefficient2 = Math.random()*1000 ;
		int _pow2 = (int)(Math.random()*10) + 13 ;
		double _coefficient3 = Math.random()*1000 ;
		int _pow3 = (int)(Math.random()*10) + 2;
		String ans = "" + _coefficient1 + "X^" + _pow1 + " + " + _coefficient2 + "X^" + _pow2 + " + " + _coefficient3 + "X^" + _pow3 ;
		Polynom p = new Polynom("" + _coefficient1 + "X^" + _pow1 + " + " + _coefficient2 + "X^" + _pow2 + " + " + _coefficient3 + "X^" + _pow3);
		System.out.println(ans);
		System.out.println(p.toString());
		if(!p.toString().equals(ans))
			fail("Eror , uncorrect constractor");
	}



	@Test
	void testF() {
		double a1 = Math.random()*1000 ;
		int _pow1 = (int)(Math.random()*1000) ;
		Monom m1 = new Monom(a1 , _pow1);
		double a2 = Math.random()*1000 ;
		int _pow2 = (int)(Math.random()*1000) ;
		Monom m2 = new Monom(a2 , _pow2);
		double a3 = Math.random()*1000 ;
		int _pow3 = (int)(Math.random()*1000) ;
		Monom m3 = new Monom(a3 , _pow3);
		Polynom p=new Polynom();
		p.add(m1);
		p.add(m2);
		p.add(m3);
		
		int _x = (int)(Math.random()*1000) ;
		double ans = a1 * Math.pow(_x , _pow1);
		ans += a2 * Math.pow(_x , _pow2);
		ans += a3 * Math.pow(_x , _pow3);

		if(p.f(_x) != ans)
			fail("Eror , value of Y is uncorrect");
	}

	@Test
	void testAddPolynom_able() {
		double a1 = Math.random()*1000 ;
		int _pow1 = (int)(Math.random()*1000) ;
		Monom m1 = new Monom(a1 , _pow1);
		double a2 = Math.random()*1000 ;
		int _pow2 = (int)(Math.random()*1000) ;
		Monom m2 = new Monom(a2 , _pow2);
		double a3 = Math.random()*1000 ;
		int _pow3 = (int)(Math.random()*1000) ;
		Monom m3 = new Monom(a3 , _pow3);
		Polynom p1 = new Polynom();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		Polynom p2 = new Polynom();
		p2.add(p1);
		if(!p1.equals(p2))
			fail("Not yet implemented");
	}

	@Test
	void testAddMonom() {
		double a1 = Math.random()*1000 ;
		int _pow1 = (int)(Math.random()*1000) ;
		Monom m1 = new Monom(a1 , _pow1);
		double a2 = Math.random()*1000 ;
		int _pow2 = (int)(Math.random()*1000) ;
		Monom m2 = new Monom(a2 , _pow2);
		double a3 = Math.random()*1000 ;
		int _pow3 = (int)(Math.random()*1000) ;
		Monom m3 = new Monom(a3 , _pow3);
		Polynom p1=new Polynom();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		Polynom p2=new Polynom();
		p2.add(m1);
		p2.add(m2);
		p2.add(m3);
		if(!p2.equals(p1))
			fail("Eror , fail adding Monom");
	}

	@Test
	void testSubstractPolynom_able() {
		double a1 = Math.random()*1000 ;
		int _pow1 = (int)(Math.random()*1000) ;
		Monom m1 = new Monom(a1 , _pow1);
		double a2 = Math.random()*1000 ;
		int _pow2 = (int)(Math.random()*1000) ;
		Monom m2 = new Monom(a2 , _pow2);
		double a3 = Math.random()*1000 ;
		int _pow3 = (int)(Math.random()*1000) ;
		Monom m3 = new Monom(a3 , _pow3);
		Polynom p1 = new Polynom();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		Polynom p2 = new Polynom();
		p2.add(m1);
		p2.add(m2);
		Polynom p3 = new Polynom();
		p3.add(m3);
		p1.substract(p3);
		if(!p1.equals(p2))
			fail("Eror , fail Substract Polynom");
	}

	@Test
	void testSubstractMonom() {
		double a1 = Math.random()*1000 ;
		int _pow1 = (int)(Math.random()*1000) ;
		Monom m1 = new Monom(a1 , _pow1);
		double a2 = Math.random()*1000 ;
		int _pow2 = (int)(Math.random()*1000) ;
		Monom m2 = new Monom(a2 , _pow2);
		double a3 = Math.random()*1000 ;
		int _pow3 = (int)(Math.random()*1000) ;
		Monom m3 = new Monom(a3 , _pow3);
		Polynom p1 = new Polynom();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		Polynom p2 = new Polynom();
		p2.add(m1);
		p2.add(m2);
		p1.substract(m3);
		if(!p1.equals(p2))
			fail("Eror , fail Substract Monom");
	}

	@Test
	void testMultiply() {
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		p.multiply(p1);
		Polynom s=new Polynom();
		s.add(new Monom(4,4));
		s.add(new Monom(8,3));
		s.add(new Monom(8,2));
		s.add(new Monom(4,1));
		if(!s.equals(p))
			fail("Eror , wrong Multiply");
	}

	@Test
	void testEqualsPolynom_able() {
		double a1 = Math.random()*1000 ;
		int _pow1 = (int)(Math.random()*1000) ;
		Monom m1 = new Monom(a1 , _pow1);
		double a2 = Math.random()*1000 ;
		int _pow2 = (int)(Math.random()*1000) ;
		Monom m2 = new Monom(a2 , _pow2);
		double a3 = Math.random()*1000 ;
		int _pow3 = (int)(Math.random()*1000) ;
		Monom m3 = new Monom(a3 , _pow3);
		Polynom p1 = new Polynom();
		p1.add(m1);
		p1.add(m2);
		p1.add(m3);
		Polynom p2 = new Polynom();
		p2.add(m1);
		p2.add(m2);
		p2.add(m3);
		if(!p1.equals(p2))
			fail("Eror , equal function not working");
	}

	@Test
	void testIsZero() {
		Polynom p1 = new Polynom() ;
		if(!p1.isZero())
			fail("Eror , checking if Polynom empty eror");
		double a1 = Math.random()*1000+1 ;
		int _pow1 = (int)(Math.random()*1000) ;
		Monom m1 = new Monom(a1 , _pow1);
		Polynom p2 = new Polynom();
		p2.add(m1);
		if(p2.isZero())
			fail("Eror , checking if Polynom empty eror");
	}

	@Test
	void testRoot() {
		Polynom p1 = new Polynom();
		p1.add(new Monom(-100,0));
		p1.add(new Monom(1,3));
		double e=0.01;
		double root=p1.root(0, 100, e);
		if(Math.abs(p1.f(root))>=e)
			fail("Eror , uncorrect Root");
	}


	@Test
	void testSize() {
		double coef0 = Math.random()*100;
		double coef1 = Math.random()*100;
		double coef2 = Math.random()*100;
		double coef3 = Math.random()*100;

		int power0 = 1;
		int power1 = 2;
		int power2 = 3;
		int power3 = 4;

		Monom m0 = new Monom(coef0 , power0);
		Monom m1 = new Monom(coef1 , power1);
		Monom m2 = new Monom(coef2 , power2);
		Monom m3 = new Monom(coef3 , power3);

		Polynom p=new Polynom();
		p.add(m0);
		p.add(m1);
		p.add(m2);
		p.add(m3);
		
		if(p.size() != 4)
			fail("ERR:wrong size");
	}
	
	@Test
	void testDerivative() {
		double coef0 = Math.random()*100;
		double coef1 = Math.random()*100;
		double coef2 = Math.random()*100;
		double coef3 = Math.random()*100;

		int power0 = (int)(Math.random()*100);
		int power1 = (int)(Math.random()*100);
		int power2 = (int)(Math.random()*100);
		int power3 = (int)(Math.random()*100);

		Monom m0 = new Monom(coef0 , power0);
		Monom m1 = new Monom(coef1 , power1);
		Monom m2 = new Monom(coef2 , power2);
		Monom m3 = new Monom(coef3 , power3);

		Polynom p0 = new Polynom();
		p0.add(m0);
		p0.add(m1);
		p0.add(m2);
		p0.add(m3);
		
		Polynom p1 = new Polynom();
		Iterator<Monom> iter = p0.iteretor();
		while(iter.hasNext()) {
			Monom m4 = new Monom(iter.next());
			m4.derivative();
			p1.add(m4);
		}
		
		if(!p0.derivative().equals(p1))
			fail("ERR:wrong derivative");
	}

	@Test
	void testArea() {
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(5,1));
		p1.add(new Monom(10,0));
		double x=p1.area(-5, 5, 0.08);
		System.out.println(x);
		x=p1.area(-5, 5, 0.09);
		System.out.println(x);
		Polynom p=new Polynom();
		p.add(new Monom(9,4));
		p.add(new Monom(4,2));
		p.add(new Monom(7,1));
		p.add(new Monom(5,0));
		x=p.area(-2, 0, 0.04);
		System.out.println(x);
		System.out.println();
	}


}
