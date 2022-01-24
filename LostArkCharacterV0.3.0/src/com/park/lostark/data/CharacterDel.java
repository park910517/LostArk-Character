package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;

public class CharacterDel {

	Scanner sc = new Scanner(System.in);
	String back = "back";
	String passward = "1234";

	public void run(ArrayList<Character> characters) {
		System.out.println(Title.DEL);
		System.out.print("비밀번호 입력:");
		String pw = sc.next();
		if (passward.equals(pw)) {
			System.out.print("삭제할 캐릭터 닉네임 입력:");
			String delName = sc.next();
			for (int i = 0; i < characters.size(); i++) {
				if (characters.get(i).getName().equals(delName)) {
					characters.remove(i);
					System.out.println("삭제 완료");

				}
			}

			if (back.equals(delName)) {
				return;
			} else {
				System.out.println("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
			}
		} else {
			System.out.println("틀렸습니다. 비밀번호를 확인해주세요.");
		}

	}
}
