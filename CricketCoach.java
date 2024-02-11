package com.tiu.springcore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Do Some exercise you lazy bum!!!";
    }
}
