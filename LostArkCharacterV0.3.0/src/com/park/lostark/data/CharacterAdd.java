package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;

public class CharacterAdd {

	public void run(ArrayList<Character> characters) {
		String name;
		String job;
		String level;
		String itemlevel;
		String gakin;
		String back = "back";
		Scanner sc = new Scanner(System.in);
			System.out.println(Title.ADD);
			System.out.print("닉네임:");
			name = sc.next();
			if(back.equals(name)) {
				return;
			}
				System.out.print("직업:");
				job = sc.next();
			if(back.equals(job)) {
				return;
			}
				System.out.print("레벨:");
				level = sc.next();
			if(back.equals(level)) {
				return;
			}
				System.out.print("템렙:");
				itemlevel = sc.next();
			if(back.equals(itemlevel)) {
				return;
			}
				System.out.print("각인:");
				gakin = sc.next();
			if(back.equals(gakin)) {
				return;
			}
				characters.add(new Character(name, job, level, itemlevel, gakin));
				System.out.println("추가 완료");
				
			

		}
	}

