// Write a program to implement various methods of a StringBuffer class
package set13;

import java.util.Scanner;

public class MainClass13_1 {

	public static void main(String[] args) {
		String name,department,course;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name = sc.nextLine();
		System.out.println("Enter the Department : ");
		department = sc.nextLine();
		System.out.println("Enter the Course : ");
		course = sc.nextLine();
		System.out.println("Enter the Year : ");
		year = sc.nextInt();
		
		StringBuffer sb = new StringBuffer("Rajagiri is of Social Sciences -> Name : ");
		sb.append(name);
		sb.append(", Department : ");
		sb.append(department);
		sb.append(", Course : ");
		sb.append(course);
		sb.append(", Year : ");
		sb.append(year);//using append method
		
		sb.insert(9, "ColLE");//using insert method
		sb.replace(12,14, "lege");//using replace method
		sb.delete(16,18);//using delete method
		System.out.println(sb);
		System.out.println("The Length is "+sb.length());//using length method
		System.out.println(sb.substring(0,35)+" is ranking 27 in India");//using substring method 
	}

}
