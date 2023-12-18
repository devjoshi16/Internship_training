package com.aixtor.trainnig.java.basics;

public class _0_brushup {

	public static void main(String[] args) {

		int a = 1, b = 7;
		double dbl = 19.4;

		System.out.println("Unary operator");
		System.out.println("10+5:" + (10 + 5));
		System.out.println("10-5:" + (10 - 5));
		System.out.println("!true:" + !true);
		System.out.println("~1:" + ~1);
		System.out.println("++1:" + (++a));
		System.out.println("--2:" + (--a));
		System.out.println("double to int of 19.4:" + (int) dbl);
		System.out.println("\n");

		
		System.out.println("Multiplicative");
		System.out.println("10*2:" + (10 * 2));
		System.out.println("10/2:" + (10 / 2));
		System.out.println("10%2:" + (10 % 2));
		System.out.println("\n");

		System.out.println("Shift");
		System.out.println("10>>1:" + (10 >> 1));
		System.out.println("10<<1:" + (10 << 1));
		System.out.println("Relational");
		System.out.println("\n");

		System.out.println("10>1:" + (10 > 1));
		System.out.println("10<1:" + (10 < 1));
		System.out.println("10>=10:" + (10 >= 10));
		System.out.println("10<=11:" + (10 <= 11));
		System.out.println("\n");

		System.out.println("Equality");
		System.out.println("10==10:" + (10 == 10));
		System.out.println("10!=11:" + (10 != 11));
		System.out.println("\n");

//		Bitwise AND	&	Left to right

		System.out.println("Bitwise");
		System.out.println("101&111:" + (101 & 111));
		System.out.println("101|111:" + (101 | 111));
		System.out.println("101^110:" + (101 ^ 110));
		System.out.println("\n");

//		Assignment	= += -= *= /= %=>>= <<= &= ^= |=	Right to left

		System.out.println("Logical");
		System.out.println("True||False:" + (true || false));
		System.out.println("True&&True:" + (true && true));
		System.out.println("\n");

		System.out.println("Ternary ?:");
		System.out.println("10==10?true:false : " + (10 == 10 ? true : false));
		System.out.println("\n");

		System.out.println("Assignment oprator");
		System.out.println("= += -= *= /= %=>>= <<= &= ^= |=");
		System.out.println("\n");

		System.out.println("Keywords in java");
		System.out.println("abstract	continue	for	new	switch\r\n"
				+ "assert	default	goto	package	synchronized\r\n"
				+ "boolean	do	if	private	this\r\n"
				+ "break	double	implements	protected	throw\r\n"
				+ "byte	else	import	public	throws\r\n"
				+ "case	enum	instanceof	return	transient\r\n"
				+ "catch	extends	int	short	try\r\n"
				+ "char	final	interface	static	void\r\n"
				+ "class	finally	long	strictfp	volatile\r\n"
				+ "const	float	native	super	while");
		
		System.out.println("\n");
		System.out.println("switch case");
		switch (a) {
		case 1: {
			System.out.println("1");
			break;
		}
		case 2: {
			System.out.println("2");
			break;
		}
		default:
			System.out.println("Default");
			break;
		}

	}

}
