package com.tyss.cg.exceptions;

public class TryFinally {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} finally {
			System.out.println("code inside finally block");
		}
	}
}
