package com.park.lostark.data;

import com.park.lostark.util.So;

public class Character {

	private String name;	//캐릭터 닉네임
	private String job;	//캐릭터 직업
	private int level;	//캐릭터 레벨
	private int itemlevel;	//캐릭터 아이템레벨
	private String gakin;	//캐릭터 각인

	public Character(String name, String job, int level, int itemlevel, String gakin) {	//생성자함수
		this.name = name;
		this.job = job;
		this.level = level;
		this.itemlevel = itemlevel;
		this.gakin = gakin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getItemlevel() {
		return itemlevel;
	}

	public void setItemlevel(int itemlevel) {
		this.itemlevel = itemlevel;
	}

	public String getGakin() {
		return gakin;
	}

	public void setGakin(String gakin) {
		this.gakin = gakin;
	}

	public void info() {	//캐릭터정보 출력
		So.pl("<" + name + "> " + job + "(" + level + ") /" + itemlevel + "/ " + gakin);
	}
}
