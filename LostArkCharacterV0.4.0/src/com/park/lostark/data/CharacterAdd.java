package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;
import com.park.lostark.util.So;

public class CharacterAdd {

	public void run(ArrayList<Character> characters) {
		String name;
		String job;
		String level;
		String itemlevel;
		String gakin;
		String back = "back";
		Scanner sc = new Scanner(System.in);
		So.pl(Title.ADD);
		So.p("닉네임:");
		name = sc.next();
		if (back.equals(name)) {
			return;
		}
		So.p("직업:");
		job = sc.next();
		if (back.equals(job)) {
			return;
		}
		So.p("레벨:");
		level = sc.next();
		if (back.equals(level)) {
			return;
		}
		So.p("아이템레벨:");
		itemlevel = sc.next();
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
