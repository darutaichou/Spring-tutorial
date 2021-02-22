package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// HTTPリクエストのidとリクエストで指定されたnameパラメータを設定したGreetingオブジェクトを画面に表示する

@RestController
public class GreetingController {

	// idを一意にするためのカウンター
	private final AtomicLong counter = new AtomicLong();
	// %sにはリクエストパラメータのnameの値が入る(パラメータがない場合は"World"が入る)
	private static final String content = "Hello %s";

	// メイン処理
	@GetMapping("/rest-service")
	public Greeting hello(@RequestParam(value = "name", defaultValue = "World")String name) {

		// 一意のidと、あいさつ文をセットしたGreetingオブジェクトをリターン。

		return new Greeting(counter.incrementAndGet(), String.format(content,name));


	}
}
