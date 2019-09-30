// Author:Jackie Zablah. Java Bootcamp 2019

//Calculate perimeter, area and volume of a room base on user input.

package lab2;

import java.util.Scanner;

public class RoomDetailGenerator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		float lenght = 0;
		float width = 0;
		float heigth = 0;
		float area = 0;
		float perimeter = 0;
		float volume = 0;
		String userChoice = "";

		System.out.println("Welcome to Any Room Detail Generator \n");

		do {

			System.out.println(">>Please enter the length: <<");
			lenght = scnr.nextFloat();
			System.out.println(">>Please enter the width: <<");
			width = scnr.nextFloat();
			System.out.println(">>Please enter the heigth: <<");
			heigth = scnr.nextFloat();

			area = lenght * width;
			perimeter = (lenght + width) * 2;
			volume = lenght * width * heigth;
			System.out.println(">> The Area is: " + area + " sq. units.");
			System.out.println(">> The Perimeter is: " + perimeter + " sq. units.");
			System.out.println(">> The Volume is: " + volume + " cubic units. ");

			System.out.println(">> Would you like to continue (y/n)?)");
			userChoice = scnr.next();

			if (userChoice.equalsIgnoreCase("n")) {
				System.out.println(">> Thank you, Goodbye!");
			}

		} while (userChoice.equalsIgnoreCase("y"));
		scnr.close();

	}

}
