package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;
import com.park.lostark.util.So;

public class CharacterEdit {

	Scanner sc = new Scanner(System.in);
	String back = "back";

	public void run(ArrayList<Character> characters) {
		So.pl(Title.EDIT);	//캐릭터 수정 제목
		So.p("수정할 캐릭터이름:");
		String editInfo = sc.next();	//수정할 캐릭터 닉넴 입력
		int search = -1;

		for (int i = 0; i < characters.size(); i++) {	//탐색
			if (characters.get(i).getName().equals(editInfo)) {
				search = i;
				break;
			}
		}

		if (search == -1) {	//배열은 0부터시작 그 이하 숫자는 없다 표시
			So.pl("그런 캐릭터는 없습니다, 닉네임을 확인해주세요.");
		} else {	//변경할 내용들 입력
			So.p("변경할 레벨 입력:");
			int level = sc.nextInt() ;

			So.p("변경할 아이템레벨 입력:");
			int itemlevel = sc.nextInt() ;

			So.p("변경할 각인 입력:");
			String gakin = sc.next();

			Character c = characters.get(search);	//setter 이용 값 저장
			c.setLevel(level);
			c.setItemlevel(itemlevel);
			c.setGakin(gakin);
			So.pl("수정 완료");
		}
	}
}
