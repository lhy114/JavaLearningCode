package com.cqu.Test;

public class PingPongCoach extends Coach implements SpeakEnglish {

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("会说英语");
    }
}
