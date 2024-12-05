package com.braindata.bankmangement.serviceImpl;
import com.braindata.bankmangement.service.*;
import com.braindata.bankmangent.model.*;
import java.util.Scanner;
public class Sbi implements Rbi {
Scanner sc=new Scanner(System.in);
Account a= new Account();
public void createAccount() {
	System.out.println("enter a account number");
	int accNo=sc.nextInt();
	System.out.println("Enter a Name: ");
	String name=sc.next();
	System.out.println("Enter a mobile number: ");
	String mobNo=sc.next();
	System.out.println("Enter a Adhar Number: ");
	String adharNo=sc.next();
	System.out.println("Enter a Gender: ");
	String gender=sc.next();
	System.out.println("Enter a Age");
	int age=sc.nextInt();
	System.out.println("enter a Balance");
	double balance=sc.nextDouble();
	a.setAccNo(accNo);
     a.setName(name);
     a.setMobNo(mobNo);
     a.setAdharNo(adharNo);
     a.setGender(gender);
     a.setAge(age);
     a.setBalance(balance);
	}
public void displayAllDetails() {
System.out.println(a);
}
public void depositeMoney() {
	double bal=a.getBalance();
	System.out.println("enter a amount to deposite: ");
	double amt=sc.nextDouble();
	a.setBalance(bal);
	System.out.println("successfully!!");
	
}
public void withdrawal() {
	double bal=a.getBalance();
	System.out.println("enter amount to withdraw:");
	double amt=sc.nextDouble();
	if(amt>bal) {
		System.out.println("insufficient balance!..");
	}
}
public void balanceCheck() {
	System.out.println(a.getBalance());
}

}
