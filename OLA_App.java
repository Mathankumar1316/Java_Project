package interviewPrograming;

import java.util.Scanner;

import io.netty.channel.AbstractCoalescingBufferQueue;

class Ola{       // parent class
	public void welcomePage() {
		System.out.println("Welcome to OLA");
	}
	
	public void ride() { // overridden non-static method 
		System.out.println("Your OLA ride is ready");
	}
}
class Premium extends Ola{ //child class extends by parent class
	public void ride() {  // overridden non-static method 
		System.out.println("your premium ride is ready");
	}
	public void costP() {
		System.out.println("per KM cost is 100_Rs in premium ride");
	}
}
class General extends Ola{  // child class extends by parent class
	public void ride() {  // overridden non-static method 
		System.out.println("your General ride is ready");
	}
	public void costG() {
		System.out.println("per KM cost is 60_Rs in General ride");
	}
}
public class OLA_App {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // scanner classs is scanning for user define input 
	Ola wp = new Ola();
	wp.welcomePage();
	System.out.println("please enter your ride option below");
	//sc.nextLine();
	String s =sc.nextLine(); // read the string input here
	if(s.equals("GeneralRide") ) { // here its check if its input true or false
	General g = new General(); // create a object for general class object
	getReady(g);
	}
	else if(s.equals("PremiumRide")) { // here its check if its input true or false
		Premium p = new Premium();  // create a object for premium class object
		getReady(p);        //if the object reference go and execute upcast and downcasting then it will give the result to the user 
		}
	else {
		System.out.println("Try again");
	}} 
	public static void getReady(Ola ob) {  //  once reference is relationship to the parent class (Ola) then it will upcasting here
		ob.ride();
	if(ob instanceof Premium) { // once check the reference is upcasted then it will executed down-casting
	Premium pr =(Premium)ob; // downcasting here
	pr.costP();
	}
	else {
		General gr =(General)ob;
		gr.costG();
	}
	}
 }
