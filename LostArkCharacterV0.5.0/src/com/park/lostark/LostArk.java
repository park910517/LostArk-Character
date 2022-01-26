package com.park.lostark;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.data.Character;
import com.park.lostark.data.CharacterAdd;
import com.park.lostark.data.CharacterDel;
import com.park.lostark.data.CharacterEdit;
import com.park.lostark.data.CharacterGold;
import com.park.lostark.data.CharacterList;
import com.park.lostark.display.Title;
import com.park.lostark.util.So;

public class LostArk {

	void run() {
		System.out.println(Title.TITLE);	//캐릭터관리 제목

		ArrayList<Character> characters = new ArrayList<Character>();
		characters.add(new Character("호엥금", "바드", 60, 1445, "절3각3전3중3구1"));
		characters.add(new Character("민트초코블라스터", "블래스터", 60, 1480, "원3예3타3화3포3"));
		characters.add(new Character("호빵앙금", "디스트로이어", 60, 1415, "원3바3슈3분3정1"));
		characters.add(new Character("호앵금", "창술사", 60, 1415, "원3예3절3질3중1"));
		characters.add(new Character("워로드가바닥에눕지를않아", "워로드", 60, 1415, "원3바3저3정3전1"));
		characters.add(new Character("이젠내가클래식한마법사다", "소서리스", 60, 1415, "원3속3타3점3중1"));
		characters.add(new Character("변신할땐개도안건드리는데", "스카우터", 60, 1415, "원3바3돌3아3진1"));
		characters.add(new Character("나는야미대수석출신도아가", "도화가", 52, 1415, "만개3각성3"));
		characters.add(new Character("뎀모닉데모닉굿모닝헤프닝", "데모닉", 51, 1340, "원3중2충1"));

		boolean isNotEnd = true;
		Scanner sc = new Scanner(System.in);
		while (isNotEnd) {
			So.p("명령어 입력(1.캐릭터목록 2.캐릭터추가 3.캐릭터수정 4.캐릭터삭제 5.캐릭터골드 e.종료):\n");
			String cmd = sc.next();
			switch (cmd) {
			case "1":	//캐릭터 목록
				CharacterList characterlist = new CharacterList();
				characterlist.run(characters);
				So.pl("");
				break;
			case "2":	//캐릭터 추가
				CharacterAdd characteradd = new CharacterAdd();
				characteradd.run(characters);
				So.pl("");
				break;
			case "3":	//캐릭터 수정
				CharacterEdit characteredit = new CharacterEdit();
				characteredit.run(characters);
				So.pl("");
				break;
			case "4":	//캐릭터 삭제
				CharacterDel characterdel = new CharacterDel();
				characterdel.run(characters);
				So.pl("");
				break;
			case "5":	//캐릭터 골드
				CharacterGold characterGold = new CharacterGold();
				characterGold.run(characters);
				So.pl("");
				break;
			case "e":	//종료
				listEnd();
				isNotEnd = false;
				return;
			default:	//이외의 값 입력할시 문구
				So.pl("올바른 명령어가 아닙니다.");

			}
		}

	}

	void listEnd() {	// 프로그램 종료 문구
		So.pl("프로그램 종료");
	}
}
