package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.util.So;

public class CharacterGold {

	int argos = 1600;	//레이드 골드
	int nBal = 2500;	//레이드 골드
	int nBia = 2500;	//레이드 골드
	int hBal = 4500;	//레이드 골드
	Scanner sc = new Scanner(System.in);

	public void run(ArrayList<Character> characters) {
		So.p("명령어 입력(1.6캐릭터 주간 총 골드 2.주간 골드 알고 싶은 닉네임): ");
		String cmd = sc.next();
		switch (cmd) {
		case "1":
			So.p("첫번째 캐릭터 닉네임:");
			String goldAllName_1 = sc.next();	//첫번째 캐릭터 입력
			for (int i = 0; i < characters.size(); i++) {
				if (characters.get(i).getName().equals(goldAllName_1)) {	//닉네임 탐색
					if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {	//탐색한 닉네임의 itemlevel값이 1415~1444인가?
						gold_1();
		}																							//탐색한 닉넴의 템렙이 1415~1444이면 gold_1함수실행, 1445이상이면 gold_2함수실행
					if (characters.get(i).getItemlevel() >= 1445) {	//탐색한 닉네임의 아이템레벨값이 1445이상인가?
						gold_2();
					}
					
				}
			}
			So.p("두번째 캐릭터 닉네임:");
			String goldAllName_2 = sc.next();// 두번째 캐릭터입력
			for (int i = 0; i < characters.size(); i++) {
				if (characters.get(i).getName().equals(goldAllName_2)) {
					if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
						int s = gold_1();	//s에 gold_1함수 넣기
					}
					if (characters.get(i).getItemlevel() >= 1445) {
						int s = gold_2();	//s에 gold_2함수 넣기
					}
					return s; //s값 리턴
				}
			}
			System.out.println(s);	//s값 출력 	//to do 첫번째 캐릭터의 골드값과 두번째 캐릭터의 골드값 더한값을 출력(최종은 6캐릭 더한값) 
			break;
		case "2":
			System.out.println("닉네임:");
			String goldName = sc.next();
			for (int i = 0; i < characters.size(); i++) {
				if (characters.get(i).getName().equals(goldName)) {
					if (characters.get(i).getItemlevel() >= 1415 && characters.get(i).getItemlevel() <= 1444) {
						System.out.println(gold_1() + "골드");
					}
					if (characters.get(i).getItemlevel() >= 1445) {
						System.out.println(gold_2() + "골드");
					}
				}
			}
			break;

		}
	}

	int gold_1() {	//두가지 레이드 골드 총값 g1에 리턴
		int g1 = argos + nBal;
		return g1;
	}

	int gold_2() {	//세가지 레이드 골드 총값 g2에 리턴
		int g2 = argos + nBia + hBal;
		return g2;
	}

}
