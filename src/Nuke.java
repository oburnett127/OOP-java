
import java.awt.Image;

//filename: "Nuke.java"

/**
Student Name: Owen Burnett
Student ID Number: *20281934
Object Oriented Programming
Course number: CMSC 3103
Course ID: CRN 20133, Spring 2011
Due: May 4, 2011
Assignment: Term Project
 */

/* Portions of the code in this project came from a program file "SpaceInvader.java" written by
 * Dr. Hong Sung, professor of Computer Science at the University of Central Oklahoma. */

public class Nuke extends GameWeapon{
    public Nuke(int x, int y, int w, int h,boolean travelingToLeft, boolean humanMissile, double missileSpeed, Image itemImage) {
		super(x, y, w, h, travelingToLeft, missileSpeed);
		this.setItemImage(itemImage);
		this.setMissileSpeed(missileSpeed);
    }	//end constructor
}   //end class Nuke
