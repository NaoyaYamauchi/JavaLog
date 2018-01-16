package com.example.wrigh.javalog;

import android.util.Log;
/**
 * Created by wrigh on 2018/01/11.
 */

class Dog extends Animal implements Movable{
    // クラス変数
    static String to_jp ="犬";

    //コンストラクタ
    public Dog(String name, int age){
        this.name =name;
        this.age = age;
    }

    // クラス関数
    public static void introduce(){
        Log.d("javatest","これは犬クラスです。");
    }

    // メンバ関数
    public void say(){
        Log.d("javatest",this.name+"("+this.age+"歳)"+"「ワンワン」");
    }

    @Override
    public void move(){
        Log.d("javatest",this.name + "("+this.age+"歳)"+"は全力で走った。");
    }
}
