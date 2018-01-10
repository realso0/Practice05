package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	Add add=new Add();
    	Sub sub=new Sub();
    	Mul mul=new Mul();
    	Div div=new Div();
    	
    	String x;
    	String calculate;
    	String ss[];
    	boolean u=true;
    	Integer a;
		Integer b;
    	
    	while (u) {
    		System.out.print(">> ");
    		
    		x=sc.nextLine();
    		
    		
    		if (x.equals("/q")) {
    			System.out.println("종료합니다.");
    			u=false;
    		} else {
    			ss=x.split(" ");
    			a=Integer.valueOf(ss[0]); //기본타입 값을 integer형으로 변환
    			calculate=ss[1];
    			b=Integer.valueOf(ss[2]);
    			
    			switch (calculate) {
    			case "+": {
    				add.setValue(a, b);
    				System.out.println(">> "+add.calculate()); break;
    			}
    			case "-": {
    				sub.setValue(a, b);
    				System.out.println(">> "+sub.calculate()); break;
    			}
    			case "/": {
    				div.setValue(a, b);
    				System.out.println(">> "+div.calculate()); break;
    			}
    			case "*": {
    				mul.setValue(a, b);
    				System.out.println(">> "+mul.calculate()); break;
    			}
    			default : System.out.println("알 수 없는 연산입니다.");
        		}
    		}
    	}   	
    }
}
