package com.vrx;

interface Interf{
	public void m1();
}
public class LambdaExpression {
	/* What is lambda expression? 
	 * - It is anonymous function.
	 * - not having name
	 * - not having modifier
	 * - not having any return type 
	 * 
	 * */
	/* Properties
	 * -----------------------
	 * 1. A lambda expression can have any no. of parameters
	 * 2. If multiple parameters then they are seperated with comma ,
	 * 3. If only one parameter then parenthesis is optional
	 * 4. Usually we can specify type of parameter. If compiler expect type based on context,
	 * then we can remove type.
	 * 5. Similar to method body, lambda expression body can contain any no. of statements.
	 * If multiple statements are there then we should enclose within curly braces.
	 * 6. If body contains only one statement then curly braces are optional.
	 * */
	public static void main(String[] args) {
		Interf i = ()-> System.out.println("Hello");
		i.m1();
	}
}
