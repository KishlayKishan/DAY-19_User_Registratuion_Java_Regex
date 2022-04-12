/*@Purpose:: As a User need to enter a valid Email ID.
 *           First name starts with Cap and has minimum 3 characters and
 *           Email E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl& co) and
 *           2 optional (xyz & in) with precise @ and . positions
 *@File:: User Registration Using Regex
 *@Author:: Kishlay Kishan
 */

package com.bridgelabz.javaregex;

import java.util.Scanner;

public class User_Registration_Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {

			System.out.println("Enter 0 : Exit");
			System.out.println("Enter 1 : To validate First Name ");
			System.out.println("Enter 2 : To validate Last Name ");
			System.out.println("Enter 3 : To validate E-mail ");

			switch (scanner.nextInt()) {
			case 0:
				System.exit(0);

			case 1:
				User_Registration.validFirstName();
				break;

			case 2:
				User_Registration.validLastName();
				break;
			case 3:
				User_Registration.validEmail();
				break;
			}
		}
	}
}
