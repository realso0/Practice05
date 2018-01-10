package com.javaex.problem02;

import java.util.*;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	List<Friend> aa = new ArrayList<Friend>();

		String name;
		String hp;
		String school;

		System.out.println("친구를 3명 등록해주세요");

		for (int i=0;i<3;i++) {
			name = sc.next(); //공백이 생길때까지 하나의 값을 입력받음
			hp = sc.next();
			school = sc.next();

			Friend friend = new Friend();

			friend.setName(name);
			friend.setHp(hp);
			friend.setSchool(school);

			aa.add(friend);
		}

		for (int i=0;i<3;i++) {
			aa.get(i).showInfo();
		}
    }

}
