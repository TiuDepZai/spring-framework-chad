package com.tiu.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Doaaa ra fries you lazy bum!!!";
    }
}
