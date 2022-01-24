package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;
import com.park.lostark.util.So;

public class CharacterDel {

	Scanner sc = new Scanner(System.in);
	String back = "back";
	String passward = "1234";

	public void run(ArrayList<Character> characters) {
		So.pl(Title.DEL);
		So.p("비밀번호 입력:");
		String pw = sc.next();
		if (passward.equals(pw)) {
			So.p("삭제할 캐릭터 닉네임 입력:");
			String delName = sc.next();
			for (int i = 0; i < characters.size(); i++) {
				if (characters.get(i).getName().equals(delName)) {
					characters.remove(i);
					So.pl("삭제 완료");
					return;
				}
			}

			if (back.equals(delName)) {
				return;
			} else {
				So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
			}
		} else {
			So.pl("틀렸습니다. 비밀번호를 확인해주세요.");
		}

	}
}
