package com.rmuti;


public class RobertoCarlos {

	
	private String name;
	private String position;
	private String friend[];
 public RobertoCarlos() {
	 name = "Roberto Carlos";
	 position = "Left back";
	 friend = new String [] {"Ronaldo","Rivaldo","Cafu"};
 }
 public RobertoCarlos(int a) {
	 System.out.println("RobertoCarlos Overloading 1");
 }
 public String getName(){
	 return name;
 }
 public String getPosition(){
	 return position;
 }
 public String[] getFriend(){
 return friend;
 }
}
