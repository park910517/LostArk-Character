package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;
import com.park.lostark.util.So;

public class CharacterAdd {

	public void run(ArrayList<Character> characters) {
		String name;	//캐릭터 닉네임
		String job;	//캐릭터 직업
		int level;	//캐릭터 레벨(숫자이므로 int)
		int itemlevel;	//캐릭터 아이템레벨
		String gakin;	//캐릭터 각인
		String back = "back";	//뒤로가기
		Scanner sc = new Scanner(System.in);
		So.pl(Title.ADD);	//캐릭터 추가 제목
		So.p("닉네임:");	
		name = sc.next();	//닉네임 입력
		if (back.equals(name)) {	//뒤로가기
			return;
		}
		So.p("직업:");
		job = sc.next();
		if (back.equals(job)) {
			return;
		}
		So.p("레벨:");
		level = sc.nextInt() ;
		if (back.equals(level)) {
			return;
		}
		So.p("아이템레벨:");
		itemlevel = sc.nextInt() ;
		if (back.equals(itemlevel)) {
			return;
		}
		So.p("각인:");
		gakin = sc.next();
		if (back.equals(gakin)) {
			return;
		}
		characters.add(new Character(name, job, level, itemlevel, gakin));
		So.pl("추가 완료");

	}
}
