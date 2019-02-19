package com.imooc.hashmap;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
//        hashMap.put(null, null);
        hashMap.put("name","tianyu");
        hashMap.put("age","25");
        System.out.println(hashMap);
    }
}
