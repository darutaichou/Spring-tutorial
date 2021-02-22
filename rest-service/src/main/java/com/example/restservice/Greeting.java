package com.example.restservice;

// HTTPリクエストのidとcontentにおけるセッター・ゲッタークラス
public class Greeting {

	private int id;
	private String content;

	// コンストラクタ
	public Greeting(int id, String content) {
		this.id = id;
		this.content = content;
	}

	// idのゲッター
	public int getId() {
		return this.id;
	}

	// contentのゲッター
	public String getcontent() {
		return this.content;
	}
}
