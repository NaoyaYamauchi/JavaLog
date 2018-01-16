package com.example.wrigh.javalog;

import android.util.Log;

/**
 * Created by wrigh on 2018/01/14.
 */

class Human extends Animal implements Thinkable {

    String hobby = "『もしも、森進一がオートバイだったらどんな風か』"; //文字列型のメンバ変数

   public Human(String name,int age){ //コンストラクタ
       this.name = name;
       this.age = age;
   }

    public void say() {
        Log.d("javatest","「私の名前は"+this.name+"です。年は"+this.age+"です。」");
    } //メソッド
    public void think(){
       Log.d("javatest","「私は"+hobby+"について考える」");
    }
}
