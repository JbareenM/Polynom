package myMath;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;


class PolynomTest {

	@Test
	void testPolynom() {
		Polynom p=new Polynom();
		if(p==null)
			fail("p does not exist");
		if(p.size()!=0)
			fail("ERR:already existed polynom");
		p.add(new Monom(2,4));
		if(p.size()==0)
			fail("ERR:the polynom can not be empty after adding monom");
	}



	@Test
	void testF() {
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

		Polynom p=new Polynom();
		p.add(m0);
		p.add(m1);
		p.add(m2);
		p.add(m3);

		double x = Math.random()*100;
		double ans = coef0 * Math.pow(x , power0);
		ans += coef1 * Math.pow(x , power1);
		ans += coef2 * Math.pow(x , power2);
		ans += coef3 * Math.pow(x , power3);

		if(p.f(x) != ans)
			fail("ERR:wrong answer");
	}

	@Test
	void testAddPolynom_able() {
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		System.out.println(p1.toString());
		p.add(p1);
		Polynom s=new Polynom();
		s.add(new Monom(4,2));
		s.add(new Monom(4,1));
		s.add(new Monom(2,0));
		if(!s.equals(p))
			fail("ERR:p and s have to be equal");
	}

	@Test
	void testSubstractMonom() {
		System.out.println("testSubstractMonom");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Monom s=new Monom(2,2);
		p.substract(s);
		Polynom p1=new Polynom();
		p1.add(new Monom(2,1));
		p1.add(new Monom(2,0));
		if(!p1.equals(p))
			fail("ERR:p and p1 have to be equal");	}

	@Test
	void testSubstractPolynom_able() {
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		System.out.println(p1.toString());
		p.substract(p1);
		Polynom s=new Polynom();
		s.add(new Monom(2,0));
		if(!s.equals(p))
			fail("ERR:p and s have to be equal");
	}

	@Test
	void testAddMonom() {
		System.out.println("testSubstractMonom");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Monom s=new Monom(2,2);
		p.add(s);
		Polynom p1=new Polynom();
		p1.add(new Monom(4,2));
		p1.add(new Monom(2,1));
		p1.add(new Monom(2,0));
		if(!p1.equals(p))
			fail("ERR:p and p1 have to be equal");
	}

	@Test
	void testMultiply() {
		System.out.println("multiply");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		System.out.println(p1.toString());
		p.multiply(p1);
		System.out.println(p.toString());
		Polynom s=new Polynom();
		s.add(new Monom(4,4));
		s.add(new Monom(8,3));
		s.add(new Monom(8,2));
		s.add(new Monom(4,1));
		if(!s.equals(p))
			fail("ERR:p and s have to be equal");
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
	void testEqualsPolynom_able() {
		System.out.println("equals");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		System.out.println(p.toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		System.out.println(p1.toString());
		System.out.println(p.equals(p1));
		if(!p.equals(p1))
			fail("ERR:p and p1 have to be equal");
	}

	@Test
	void testIsZero() {
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

		Polynom p=new Polynom();
		p.add(m0);
		p.add(m1);
		p.add(m2);
		p.add(m3);
		
		if(p.isZero() )
			fail("ERR:if the polynom is the zero polynom then its size have to be zero");
	}

	@Test
	void testRoot() {
		Polynom p=new Polynom();
		p.add(new Monom(-100,0));
		p.add(new Monom(1,3));
		double eps=0.01;
		double root0=p.root(0, 100, eps);
		System.out.println(root0);
		System.out.println(p.f(root0));
		if(Math.abs(p.f(root0))>=eps)
			fail("ERR:the function root is not in the required eps");
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
		
		
		/*
		System.out.println("testDerivative");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		System.out.println(p.toString());
		System.err.println(p.derivative().toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(4,1));
		p1.add(new Monom(2,0));
		System.out.println(p1.toString());
		System.out.println(p.derivative().equals(p1));
		if(!p.derivative().equals(p1))
			fail("ERR:the p and p1 derivative are not equal");
			*/
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

	@Test
	void testPolynomString() {
		System.out.println("tostring----------------");
		String s="3x^8 -5x^3+2x^4 -1x";
		Polynom p1=new Polynom(s);
		System.out.println(p1);
		Polynom p=new Polynom();
		p.add(new Monom(3,8));
		p.add(new Monom(-5,3));
		p.add(new Monom(2,4));
		p.add(new Monom(-1,1));
		if(!p.equals(p1))
			fail("ERR:p and p1 have to be equal");
	}

}



