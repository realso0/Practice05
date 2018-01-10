package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	List<Goods> aa=new ArrayList<Goods>();
    	
    	String name;
    	int count;
    	int price;
    	Goods goods;
    	int yy = 0;
    	
    	System.out.println("상품 3개를 입력해주세요");
    	
    	for (int i=0;i<3;i++) {
    		name=sc.next();
    		price=sc.nextInt();
    		count=sc.nextInt();
    		
    		goods=new Goods(name,price,count);
    		aa.add(goods);

    	}
    	
    	for (int i=0;i<3;i++) {
    		goods=aa.get(i);
    		goods.print();

			yy+=goods.getCount();
		}
        System.out.println("모든 상품의 갯수는 "+yy+"개입니다.");
    }

}
