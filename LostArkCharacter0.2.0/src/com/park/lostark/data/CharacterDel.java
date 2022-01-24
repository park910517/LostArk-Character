package com.park.lostark.data;

import java.util.ArrayList;
import java.util.Scanner;

import com.park.lostark.display.Title;

public class CharacterDel {

		Scanner sc = new Scanner(System.in);
		String back = "back";
		public void run(ArrayList<Character> characters) {
			System.out.println(Title.DEL);
			System.out.print("삭제할 캐릭터 닉네임 입력:");
			String delName = sc.next();
			for(int i=0; i<characters.size(); i++) {
				if(characters.get(i).getName().equals(delName)) {
					characters.remove(i);
					System.out.println("삭제 완료");
				
				}
			}
			if(back.equals(delName)) {
				return;
			}else {
				System.out.println("그런 캐릭터는 없습니다. 닉네임을 확인해주세요.");
			}
		}
}
