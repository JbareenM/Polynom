package myMath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonomTest {

	@Test
	void testMonomString() {
		Monom m =new Monom("2x^4");
		Monom a=new Monom(2,4);
		if(!m.equals(a))
			fail("ERR:both Monom have to be equals");
	}

	@Test
	void testMultiply() {
		double coef0 = Math.random()*100;
		double coef1 = Math.random()*100;
		int power0 = (int)(Math.random()*100);
		int power1 = (int)(Math.random()*100);
		Monom m1 = new Monom(coef0,power0);
		Monom m2 = new Monom(coef1,power1);
		m1.multiply(m2);
		if(m1.get_coefficient()!=coef0*coef1||m1.get_power()!=power0+power1)
			fail("ERR:both Monom have to be equals");
	}

	@Test
	void testDerivative() {
		double coef0 = Math.random()*100;
		int power0 = (int)(Math.random()*100);
		Monom m0 = new Monom(coef0 , power0);
		m0.derivative();
		if(m0.get_coefficient() != power0*coef0 || m0.get_power() != power0-1)
			fail("ERR: coefficient and power are not equal to the derivative power and coefficient");
	}

	@Test
	void testAdd() {
		double coef0 = Math.random()*100;
		double coef1 = Math.random()*100;
		int power = (int)(Math.random()*100);
		Monom m1 = new Monom(coef0 , power);
		Monom m2 = new Monom(coef1 , power);
		m1.add(m2);
		if((m1.get_coefficient() != coef0+coef1))
			fail("cofficient and power are not equal to that after adding the two monoms");
	}

	@Test
	void testSubstract() {
		double coef0 = Math.random()*100;
		double coef1 = Math.random()*100;
		int power0 = (int)(Math.random()*100);
		Monom m1 = new Monom(coef0,power0);
		Monom m2 = new Monom(coef1,power0);
		m1.substract(m2);
		if(m1.get_coefficient() != coef0-coef1 )
			fail("cofficient and power are not equal to that after substracting the two monoms");
	}
	@Test
	void testMonomDoubleInt() {
		double coef0 = Math.random()*100;
		int power0 = (int)(Math.random()*100);
		Monom m0 = new Monom(coef0 , power0);
		if(m0.get_coefficient() != coef0 || m0.get_power() != power0)
			fail("the cofficinet or the power are not equal");
	}

	@Test
	void testMonomMonom() {
		double coef0 = Math.random()*100;
		int power0 = (int)(Math.random()*100);
		Monom m0 = new Monom(coef0 , power0);
		Monom m1 = new Monom(m0);
		if(m1.get_coefficient() != coef0 || m1.get_power() != power0)
			fail("the cofficinet or the power are not equal");
	}

	@Test
	void testF() {
		double coef = Math.random()*100;
		int power = (int)(Math.random()*100);
		Monom m = new Monom(coef , power);
		double x = Math.random()*100;
		if(coef*Math.pow(x, power) != m.f(x))
			fail("ERR:wrong answer");
	}

	@Test
	void testToString() {
		double coef = Math.random()*100;
		int power = (int)(Math.random()*100);
		Monom m = new Monom(coef,power);
		
		if(coef == 0) {
			if(!m.toString().equals("0"))
				fail("ERR:the power or the coef are not equals");

		}
		else if(power == 0) {
			if(!m.toString().equals("" + coef))
				fail("ERR:the power or the coef are not equals");

		}
		else if(power == 1) {
			if(!m.toString().equals("" + coef + "X"))
				fail("ERR:the power or the coef are not equals");
		}
		else {
			if(!m.toString().equals("" + coef + "X^" + power))
				fail("ERR:the power or the coef are not equals");
		}
	}

}
