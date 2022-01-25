package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;
import com.park.lostark.util.So;

public class CharacterList {

	String back = "back";

	public void run(ArrayList<Character> characters) {
		So.p("명령어 입력(캐릭터목록>> 1.전체목록 2.검색 (뒤로가기는 back입력)):");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();
		switch (cmd) {
		case "1":
			So.pl(Title.LIST);
			for (Character c : characters) {
				c.info();
			}
			break;
		case "2":
			So.pl(Title.SEARCH);
			So.p("검색하고 싶은 캐릭터 닉네임:");
			String characterSearch = sc.next();
			for (int i = 0; i < characters.size(); i++) {
				if (characters.get(i).getName().equals(characterSearch)) {
					characters.get(i).info();
					return;
				}
			}

			if (back.equals(characterSearch)) {
				return;

			}
			boolean search = characters.contains(characterSearch);
			if (search == false) {
				So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
				return;
			}

		}

	}
}
