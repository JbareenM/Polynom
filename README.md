# Polynom
This repository represent the polynomial function
Ex1 Polynom Codded by : 207392283 318185311 314638867
descreption This project represents monomial, polynomial with many functions and operations Monom class Use a monom from the format of ax^b. (a must be a (double) number And b must be every (integer)number greater and equal to 0) Note: We assumed that the input is valid ax^b The class monom supports some functions as • add=>adding two monoms if they have the same power • derivative: computing the derivative of a monom • f(x): compute the monom in a given number • multiply: multiple between our monom and giving monom • is equal: checks if the two monom have the same coeff and power • is zero:checks if the coeff is zero(the monom is zero) Polynom class Use a ploynom from the format of ax1^b + ax2^b + .... + axn^b. (a must be a (double) number And b must be every (integer)number greater and equal to 0)
Note: We assumed that the input is valid ax1^b + ax2^b + .... + axn^b polynom (string):every input is valid(ax^b) without "*"
The class polynom supports some functions as: • add - there is two options to add function add Monom/Polynom(using Polynom_able) ,the monom function adds monom to our polynom and the polynom function adds polynom to our polynom. • Derivative: compute the derivative of the polynom without changing the current polynom(it puts the derivative in a new polynom) • f(x): computes the polynom in a given number • multiply: multiples two polynoms • subtract: subtracts two polynoms • root • area: computing the area of the polynom in a giving eps • is equal: checks if two polynoms are equal • is zero: checks if every coeff of the monoms in the polynom are 0 • polynom(string): every input is valid (ax^b) without "*" Example run To show the polynom graph you must type "Graph 'name'=new Graph(put your polynom name,from(double x1),to (double x2);
‘name’=setVisible(true);" 
Example: "Graph 'name'=new Graph(p,-5,5);
‘name’=setVisible(true);"


