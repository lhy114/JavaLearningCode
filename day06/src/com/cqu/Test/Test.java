package com.cqu.Test;

public class Test {
    public static void main(String[] args) {
        PingPongCoach pingPongCoach = new PingPongCoach();
        PingPongPlayer pingPongPlayer = new PingPongPlayer();

        pingPongCoach.speakEnglish();
        pingPongPlayer.speakEnglish();

        pingPongCoach.teach();
        pingPongPlayer.learn();


    }
}
