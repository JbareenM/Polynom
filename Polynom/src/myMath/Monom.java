
package myMath;
/**
 * This class represents a simple "Monom" of shape a*x^b, where a is a real number and a is an integer (summed a none negative), 
 * see: https://en.wikipedia.org/wiki/Monomial 
 * The class implements function and support simple operations as: construction, value at x, derivative, add and multiply. 
 * @author Boaz
 *
 */
/**  
 * function that returns the value of the coefficient and the power 
 */                                                                                            
public class Monom implements function{                             

	public double get_coefficient() {
		return _coefficient;
	}
	public int get_power() {
		return _power;
	}
	/** 
	 *function that check if two monoms are equal
	 */
	public boolean equals(Monom m1) {
		if(m1==null || this==null)
			return true;
		if(m1==null && this != null || m1!=null && this==null)
			return false;
		if(this.get_coefficient() != m1.get_coefficient() || this.get_power() != m1.get_power())
			return false;
		return true;
	}
	/**
	 *constructor
	 */ 
	public Monom (String s) {    
		Monom th = init_from_String(s);
		this.set_coefficient(th._coefficient);
		this.set_power(th._power);
	}
	/**
	 * function that changes the monom from string to double
	 */
	private static Monom init_from_String(String s) {           
		if (s == null) throw new RuntimeException("error can not recive null");
		double a = 0;
		int b = 0;
		String in = s.toLowerCase();
		int inx = in.indexOf("x");
		/** 
		 *check if the index of the x is smaller than 0 
		 */
		if (inx < 0) {              
			/** 
			 *if it is smaller then return the coefficient of the monom and change it to double  
			 */       
			a = Double.parseDouble(in);               
		}
		else {
			/**
			 * if not create new string that is a substring from 0 to inx
			 */
			String c = in.substring(0 , inx);     
			/**
			 * change from string to double
			 */
			a = Double.parseDouble(c);  
			/**
			 * return the index of "^"
			 */
			int inp = in.indexOf("^");   
			/**
			 * checks if the index is smaller than 0
			 */
			if (inp < 0) {                
				/** 
				 *new string that is a substring from inx+1 to the end of (s)
				 */
				String p = in.substring(inx+1);       
				p = "1" + p;
				b = Integer.parseInt(p);
				if (b != 1)  throw new RuntimeException("error");
			}

			else {
				String v = in.substring(inp+1);
				b = Integer.parseInt(v);
			}
		}
		return new Monom(a,b);

	}
	/** 
	 *a function that multiples two monoms 
	 */
	public void multiply(Monom ot) {    
		/**
		 * multiple the two cofficents
		 */
		set_coefficient(this._coefficient*ot._coefficient); 
		/**
		 * add the two powers
		 */
		set_power(this._power+ot._power);  
	}
	/**
	 *     function that compute the dervivate of a monom 
	 */
	public void derivative() {    
		set_coefficient(this._coefficient*this._power);
		set_power(this._power-1);
	}
	/**
	 *function that add two monoms 
	 */
	public void add(Monom ot) {     
		/**
		 * if the power of the monoms is not equal they can not be added
		 */
		if (ot._power != this._power)throw new RuntimeException("error could not add diffrent power");        
		set_coefficient(this._coefficient+ot._coefficient);			
	}
	/**
	 *function that substracts two monoms 
	 */
	public void substract(Monom ot) {  
		/**
		 * if the power of the monoms is not equal they can not be added
		 */
		if (ot._power != this._power)throw new RuntimeException("error could not add diffrent power");          
		set_coefficient(this._coefficient - ot._coefficient);			
	}
	/**
	 *constructor 
	 */
	public Monom(double a, int b){        
		this.set_coefficient(a);
		this.set_power(b);
		if (b < 0) throw new RuntimeException("error have to be greater than 0");

	}
	/**
	 * function that returns s
	 */
	public String toString() {
		if(this._coefficient == 0)
			return "0";
		else if(this._power == 0)
			return "" + this._coefficient ;
		else if(this._power == 1)
			return "" + this._coefficient + "X";
		return "" + this._coefficient + "X^" + this._power;
	}
	/**
	 * copy constructor
	 */
	public Monom(Monom ot) {     
		if (ot == null) throw new RuntimeException("error can not be null");
		else	{
			this._coefficient = ot._coefficient;
			this._power = ot._power;
		}

	}
	// ***************** add your code below **********************


	//****************** Private Methods and Data *****************
	/*
	 * cofficient=a
	 */
	private void set_coefficient(double a){     
		this._coefficient = a;
	}
	/** 
	 *power =p
	 */
	private void set_power(int p) {            
		this._power = p;
	}

	private double _coefficient; 
	private int _power;
	@Override
	/**
	 * function that returns the result of a monom in a random x
	 */
	public double f(double x) {        
		return this._coefficient*Math.pow(x, this._power);
	} 
}
