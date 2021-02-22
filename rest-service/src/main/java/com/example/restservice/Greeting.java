package com.example.restservice;

// HTTPリクエストのidとnameにおけるセッター・ゲッタークラス
public class Greeting {

	private int id;
	private String name;

	// コンストラクタ
	public Greeting(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// idのゲッター
	public int getId() {
		return this.id;
	}

	// nameのゲッター
	public String getName() {
		return this.name;
	}
}
