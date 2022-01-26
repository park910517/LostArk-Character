package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;
import com.park.lostark.util.So;

public class CharacterGold {

	int argos = 1600; // 레이드 골드
	int nBal = 2500; // 레이드 골드
	int nBia = 2500; // 레이드 골드
	int hBal = 4500; // 레이드 골드
	Scanner sc = new Scanner(System.in);
	int s = 0;
	int s1 = 0;
	int s2 = 0;
	int s3 = 0;
	int s4 = 0;
	int s5 = 0;
	boolean isNotEnd = true;

	public void run(ArrayList<Character> characters) {
		So.p("명령어 입력(캐릭터골드>> 1.6캐릭터 주간 총 골드 2.주간 골드 알고 싶은 닉네임(뒤로가기는 back입력): ");
		boolean x = true;
		String cmd = sc.next();
		while (isNotEnd) {
			switch (cmd) {
			case "1":
				So.pl(Title.ALLGOLD);
				So.p("첫번째 캐릭터 닉네임:");
				x = goldName1(characters);
				if (x == false) {
					isNotEnd = false;
					break;
				}
				So.p("두번째 캐릭터 닉네임:");
				x = goldName2(characters);
				if (x == false) {
					isNotEnd = false;
					break;
				}
				So.p("세번째 캐릭터 닉네임:");
				x = goldName3(characters);
				if (x == false) {
					isNotEnd = false;
					break;
				}
				So.p("네번째 캐릭터 닉네임:");
				x = goldName4(characters);
				if (x == false) {
					isNotEnd = false;
					break;
				}
				So.p("다섯번째 캐릭터 닉네임:");
				x = goldName5(characters);
				if (x == false) {
					isNotEnd = false;
					break;
				}
				So.p("여섯번째 캐릭터 닉네임:");
				x = goldName6(characters);
				if (x == false) {
					isNotEnd = false;
					break;
				}
				So.pl(s + s1 + s2 + s3 + s4 + s5 + "골드");
				isNotEnd = false;
				break;
			case "2":
				So.pl(Title.GOLDNAME);
				x = proc2(characters);
				if(x == false || x == true) {
					isNotEnd = false;
					break;
				}
					break;
				
			case "back":
				isNotEnd = false;
				break;
			default:
				So.pl("틀린 명령어입니다. 명령어를 확인해주세요.");
				isNotEnd = false;
				break;
			}
		}
	}

	int gold_1() { // 두가지 레이드 골드 총값 g1에 리턴
		int g1 = argos + nBal;
		return g1;
	}

	int gold_2() { // 세가지 레이드 골드 총값 g2에 리턴
		int g2 = argos + nBia + hBal;
		return g2;
	}

	int gold_3() {
		int g3 = hBal + nBia;
		return g3;
	}

	boolean proc2(ArrayList<Character> characters) { // 캐릭터 하나의 주간골드수익
		So.pl("닉네임:");
		String goldName = sc.next();
		for (int i = 0; i < characters.size(); i++) {
			if (characters.get(i).getName().equals(goldName)) {
				if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
					So.pl(gold_1() + "골드");
				}
				if (characters.get(i).getItemlevel() >= 1445 && characters.get(i).getItemlevel() <= 1472) {
					So.pl(gold_2() + "골드");
				}
				if (characters.get(i).getItemlevel() >= 1475) { // 탐색한 닉네임의 아이템레벨값이 1475이상인가?
					So.pl(gold_3() + "골드");
				}
				return true;
			}
		}

		So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
		return false;

	}

	boolean goldName1(ArrayList<Character> characters) {
		String goldAllName = sc.next();

		for (int i = 0; i < characters.size(); i++) {
			if (characters.get(i).getName().equals(goldAllName)) {
				if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
					s = gold_1(); // s에 gold_1함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1445 && characters.get(i).getItemlevel() <= 1472) {
					s = gold_2(); // s에 gold_2함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1475) {
					s = gold_3();
				}
				return true;
			}

		}

		So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
		return false;

	}

	boolean goldName2(ArrayList<Character> characters) {
		String goldAllName = sc.next();

		for (int i = 0; i < characters.size(); i++) {
			if (characters.get(i).getName().equals(goldAllName)) {
				if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
					s1 = gold_1(); // s에 gold_1함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1445 && characters.get(i).getItemlevel() <= 1472) {
					s1 = gold_2(); // s에 gold_2함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1475) {
					s1 = gold_3();
				}
				return true;
			}

		}

		So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
		return false;

	}

	boolean goldName3(ArrayList<Character> characters) {
		String goldAllName = sc.next();

		for (int i = 0; i < characters.size(); i++) {
			if (characters.get(i).getName().equals(goldAllName)) {
				if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
					s2 = gold_1(); // s에 gold_1함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1445 && characters.get(i).getItemlevel() <= 1472) {
					s2 = gold_2(); // s에 gold_2함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1475) {
					s2 = gold_3();
				}
				return true;
			}

		}

		So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
		return false;

	}
	boolean goldName4(ArrayList<Character> characters) {
		String goldAllName = sc.next();

		for (int i = 0; i < characters.size(); i++) {
			if (characters.get(i).getName().equals(goldAllName)) {
				if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
					s3 = gold_1(); // s에 gold_1함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1445 && characters.get(i).getItemlevel() <= 1472) {
					s3 = gold_2(); // s에 gold_2함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1475) {
					s3 = gold_3();
				}
				return true;
			}

		}

		So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
		return false;

	}
	boolean goldName5(ArrayList<Character> characters) {
		String goldAllName = sc.next();

		for (int i = 0; i < characters.size(); i++) {
			if (characters.get(i).getName().equals(goldAllName)) {
				if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
					s4 = gold_1(); // s에 gold_1함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1445 && characters.get(i).getItemlevel() <= 1472) {
					s4 = gold_2(); // s에 gold_2함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1475) {
					s4 = gold_3();
				}
				return true;
			}

		}

		So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
		return false;

	}

	

	boolean goldName6(ArrayList<Character> characters) {
		String goldAllName = sc.next();

		for (int i = 0; i < characters.size(); i++) {
			if (characters.get(i).getName().equals(goldAllName)) {
				if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
					s5 = gold_1(); // s에 gold_1함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1445 && characters.get(i).getItemlevel() <= 1472) {
					s5 = gold_2(); // s에 gold_2함수 넣기
				}
				if (characters.get(i).getItemlevel() >= 1475) {
					s5 = gold_3();
				}
				return true;
			}

		}

		So.pl("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
		return false;

	}

}
