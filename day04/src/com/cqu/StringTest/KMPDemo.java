package com.cqu.StringTest;
public class KMPDemo {

    public static void main(String[] args) {
        String text = "ABC ABCDAB ABCDABCDABDE";
        String pattern = "ABCDABD";

        // 1. Java 自带的 contains
        System.out.println("contains 结果: " + text.contains(pattern));

        // 2. KMP 实现
        int index = kmpSearch(text, pattern);
        System.out.println("KMP 找到的位置: " + index);
        if (index != -1) {
            System.out.println("从该位置截取: " + text.substring(index, index + pattern.length()));
        }
    }

    // KMP 搜索：返回匹配的起始索引，没找到返回 -1
    public static int kmpSearch(String text, String pattern) {
        if (pattern.isEmpty()) return 0;
        int[] next = buildNext(pattern);  // 1. 先构建部分匹配表

        int j = 0;  // pattern 的指针
        for (int i = 0; i < text.length(); i++) {
            // 不匹配时，利用 next 表回退 j（不回退 i）
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = next[j - 1];
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            if (j == pattern.length()) {
                return i - j + 1;  // 找到
            }
        }
        return -1;
    }

    // 构建部分匹配表（next 数组）
    private static int[] buildNext(String pattern) {
        int[] next = new int[pattern.length()];
        int j = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = next[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}