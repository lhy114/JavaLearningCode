package com.cqu.Test;

public class PingPongPlayer extends Player implements SpeakEnglish {

    @Override
    public void learn() {
        System.out.println("学习乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("会说英语");
    }
}
