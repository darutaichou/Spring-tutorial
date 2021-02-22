package com.example.restservice;

// HTTPリクエストのidとnameにおけるセッター・ゲッター

public class Greeting {

	private int id;
	private String name;

	// コンストラクタ
	public void Greeting(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// idのゲッター
	public int getId() {
		return this.id;
	}

	// nameのゲッター
	public name getName() {
		return this.name;
	}
}
