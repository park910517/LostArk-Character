package com.park.lostark.data;

import java.util.ArrayList;
import com.park.lostark.data.Character;
import com.park.lostark.display.Title;

public class CharacterList {

		public void run(ArrayList<Character> characters) {
			System.out.println(Title.LIST);
				for(Character c : characters) {
					c.info();
				}
		}
}
