// Programmers: Kelechi
// Course: CS 212
// Due Date: 2/1/2024
// Lab Assignment: IN CLASS ASSIGNMENT: SKI JUMP
// Problem Statement:  
// Data In: hillType and Speed
// Data Out: Distance and points
// Credits: N/A

import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    //welcome message
	    System.out.println("Welcome to the ski jump program.");
	    
	    //ask user for input
	    System.out.println("What type of hill did you use? Normal or Large? ");
	    String hillType = scanner.nextLine();
	    
	    System.out.println("What was the speed you reached in your ski jump? ");
	    float speed = scanner.nextFloat();
	    
	    int height = 0;
        double points_per_meter = 0;
        int par = 0;
        
	    //if statements for which type of hill
	    if(hillType.equals("normal") || hillType.equals("Normal")){
	        height = 46;
	        points_per_meter = 2;
	        par = 90;
	    }
	    else if(hillType.equals("large") || hillType.equals("Large")){
	        height = 70;
	        points_per_meter = 1.8;
	        par = 120;
	    }else{
	        System.out.print("invalid input. please try again.");
	        return;
	    }
	    
	    //calculate the time in air, distance and points earned
	    double timeInAir = Math.sqrt((2*height)/9.8);
	    int distance = (int) (speed * timeInAir);
	    double pointsEarned = 60 + (distance - par)*points_per_meter;
	    
	    //if else statements based on the users points
	    if(pointsEarned >= 61){
	        System.out.println("Your distance was " + distance + " You got " + pointsEarned + " points. " + " Great job for doing better than par!");
	    }
	    else if(pointsEarned <10){
	        System.out.println("Your distance was " + distance + " You got " + pointsEarned + " points. " + " What happened?");
	    }
	    else{
	        System.out.println("Your distance was " + distance + " You got " + pointsEarned + " points. " + " Sorry you didn’t go very far");
	    }
	}
}
