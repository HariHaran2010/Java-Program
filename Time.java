package net.demo;

public class Time {

	public static void main(String[]args){
		int time = 17 ; 
		if(time<=12){
			System.out.println("Good Moring");
		}
		else if((time>=12)&&(time<17)){
			System.out.println("Good Afternoon");
		}
		else if((time>=17)&&(time<19)){
			System.out.println("Good Evening");
		}
		else if((time>=19)&&(time<=24)){
			System.out.println("Good Night");
		}
		else {
			System.out.println("INVALID");
		}
	}
}