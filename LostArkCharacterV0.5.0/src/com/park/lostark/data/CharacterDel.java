package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;
import com.park.lostark.util.So;

public class CharacterDel {

	Scanner sc = new Scanner(System.in);
	String back = "back";
	String passward = "1234";	//캐릭터 삭제전 입력 필요한 비밀번호

	public void run(ArrayList<Character> characters) {
		So.pl(Title.DEL);	//캐릭터 삭제 제목
		So.p("비밀번호 입력:");
		String pw = sc.next();	//비밀번호 입력
		if (passward.equals(pw)) {	//비밀번호 일치
			So.p("삭제할 캐릭터 닉네임 입력:");
			String delName = sc.next();	//삭제할 캐릭터 닉네임 입력
			for (int i = 0; i < characters.size(); i++) {	//탐색
				if (characters.get(i).getName().equals(delName)) {
					characters.remove(i);	// 탐색결과 삭제
					So.pl("삭제 완료");
					return;
				}
			}

			if (back.equals(delName)) {	//뒤로가기
				return;
			} else {
				So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
			}
		} else {	//비밀번호 불일치
			So.pl("틀렸습니다. 비밀번호를 확인해주세요.");
		}

	}
}
