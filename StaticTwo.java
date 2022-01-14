package com.noorteck.java.day16;

public class StaticTwo {
	//static method
	
	public static void setData() {
		
		StaticOne obj = new StaticOne ();
		
	//call variable country
		obj.country = "USA";
		
		//call getCount
		obj.getCount();
		
	}

}

/**

accessing not static variable inside static method from the different class
--> create classObject then objectName.variableName

accessing Non Static Method inside static method from the different class

--> Create ClassObject then objectName.methodName()

*/
