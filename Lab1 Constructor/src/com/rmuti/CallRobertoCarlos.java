package com.rmuti;

	import java.util.Arrays;

	public class CallRobertoCarlos {

		public static void main(String[] args) {
			RobertoCarlos robertoCarlos = new RobertoCarlos();
			System.out.println("Name : "+robertoCarlos.getName());
			System.out.println("Position : "+robertoCarlos.getPosition());
			System.out.println("Friend : "+Arrays.toString(robertoCarlos.getFriend()));
			robertoCarlos = new RobertoCarlos(1);
		}

	}