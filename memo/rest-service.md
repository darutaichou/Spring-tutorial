# 2021/2/22

## @GetMappingをなぜからクラスに付けていた。

## @RequestParamもなぜかクラスの引数にしていた。

@GetMapping("/rest-service")
public Greeting hello(@RequestParam(value = "name",defaultValue = "World")String name) {
    ~
}

## キャスト

Long num = 1;

(int)num;

    →　int型になってる

## String.format()

String.format(書式文字列,値);

Hello %s → %sに値が入る。

## AtomicLongクラス

AtomicLong atomic = new AtomicLong(100);

System.out.println(atomic.incrementAndGet());
// 101

* incrementAndGet():+1増加させ、変更された値を返す。

## static finalとfinalの違い。

* どちらも定数ではある。

* staticをつけないとコンストラクタでの初期化を許すことになる。（インスタンスごとに違う値を設定することができる）

* staticをつけるとインスタンスではなく、クラスで固有な定数となる。