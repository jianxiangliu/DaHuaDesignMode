package com.hawk.design.mode.bridge;

/**
 * Created by Jerry on 2019/1/5.
 */
public class HandsetBrandN extends AHandsetBrand {
    @Override
    public void run() {
        System.out.println("HandsetBrandN ");
        soft.run();
    }
}