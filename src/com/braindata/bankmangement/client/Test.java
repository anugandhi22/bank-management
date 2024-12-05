package com.braindata.bankmangement.client;
import com.braindata.bankmangement.serviceImpl.*;
import java.util.Scanner;
import com.braindata.bankmangement.service.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
	Rbi bank=new Sbi();
     boolean flag=true;
     while(flag)
     {
    System.out.println("--welcome--");
     System.out.println("---Select---\na.CreateAccount\nb.displayAllDetails\nc.depositemoney\nd.withdrawal\ne.balanceCheck\nf.exit");
     String ch=sc.next();
     switch(ch)
     {
     case"a":
     	bank.createAccount();
     	break;
     case"b":
     bank.displayAllDetails();
     	break;
     case"c":
     	bank.depositeMoney();
     	break;
     case"d":
     	bank.withdrawal();
     	break;
     	case"e":
         	bank.balanceCheck();
         	break;
         
     case"f":
     	System.out.println("Thank you!!!");
     	flag=false;
     	break;
     	default:
     		System.out.println("Invaild Input");
     		break;
     }
     
     }

     
	}

}
