package com.vrx;

import java.util.function.Predicate;

public class PredicateTest {

	/*
	 * A predicate is a function with a single argument and returns boolean value.
	 * To implement predicate functions in java, oracle people introduced Predicate
	 * interface in 1.8 version(i.e.,Predicate<T>). Predicate interface present in
	 * java.util.function package. It’s a functional interface and it contains only
	 * one method i.e., test()
	 * 
	 * interface Predicate<T> { public boolean test(T t); }
	 * 
	 * INPUT : single conditional argument OUTPUT : boolean METHOD : test()
	 */
	public static void main(String[] args) {
		System.out.println("Check numbers greater than 10");
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(10));
		System.out.println(p.test(33));
		System.out.println(p.test(50));
		System.out.println(p.test(5));
		System.out.println();
		System.out.println("Find even numbers");
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Predicate<Integer> p1 = i -> (i % 2 == 0);
		findEven(p1, num);
		System.out.println();
		System.out.println();
		System.out.println("Check string length greater than 3");
		Predicate<String> p2 = i -> (i.length() > 3);
		checkGreaterThan3(p2, "El");

		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		System.out.println();
		Predicate<Integer> p3 = i -> i > 10;
		Predicate<Integer> p4 = i -> (i % 2 == 0);
		System.out.println("Numbers greater than 10");
		m1(p3, x);
		System.out.println();
		System.out.println("Numbers that are even");
		m1(p4, x);
		System.out.println();
		System.out.println("Numbers greater than 10 and even");
		m1(p3.and(p4), x);
		System.out.println();
		System.out.println("Numbers greater than 10 or even");
		m1(p3.or(p4), x);
		System.out.println();
		System.out.println("Numbers not greater than 10");
		m1(p3.negate(), x);
		System.out.println();
	}

	/*
	 * Predicate joining ------------------------------- It’s possible to join
	 * predicates into a single predicate by using the following methods: and() or()
	 * negate() these are exactly same as logical AND ,OR complement operators
	 */
	public static void findEven(Predicate<Integer> p, int[] num) {
		for (int i : num) {
			if (p.test(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void checkGreaterThan3(Predicate<String> p, String s) {
		System.out.println(p.test(s));

	}

	public static void m1(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
