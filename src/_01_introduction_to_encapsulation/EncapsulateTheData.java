package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	int getItemsReceived() {
		return itemsReceived;
	}
	void setItemsReceived(int a) {
		if(a>0) {
			itemsReceived = a;
		} else {
			itemsReceived = 0;
		}
		
	}
	
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	float getDegreesTurned() {
		return degreesTurned;
	}
	void setDegreesTurned(float a) {
		if(a>=0.0&&a<=360.0) {
			degreesTurned = a;
		}
	}
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	String getNomenclature() {
		return nomenclature;
	}
	void setNomenclature(String a) {
		if(a.equals("")) {
			nomenclature = " ";
		} else {
			nomenclature = a;
		}
	}
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	Object getMemberObj() {
		return memberObj;
	}
	void setMemberObj(Object a) {
		if(a instanceof String) {
			memberObj = new Object();
		} else {
			memberObj = a;
		}
	}
	public static void main(String[] args) {
		
		
	}
}
