package com.example.wrigh.javalog;

import android.util.Log;

/**
 * Created by wrigh on 2018/01/12.
 */

public class BigDog extends Dog{
    // クラス編集
    static String to_jp = "大型犬";

    public BigDog(String name,int age){
        super(name,age);
    }

    // クラス関数
    public static void introduce(){
        Log.d("javatest","これは大型犬クラスです。");
    }
}
