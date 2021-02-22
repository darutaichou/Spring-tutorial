package com.example.restservice;

// HTTPリクエストのidとcontentにおけるセッター・ゲッタークラス
public class Greeting {

	private long id;
	private String content;

	// コンストラクタ
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	// idのゲッター
	public long getId() {
		return this.id;
	}

	// contentのゲッター
	public String getcontent() {
		return this.content;
	}
}
