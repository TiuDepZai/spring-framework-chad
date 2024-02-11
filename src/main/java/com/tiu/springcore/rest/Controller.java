package com.tiu.springcore.rest;

import com.tiu.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Coach myCoach;

//    @Autowired
//    public Controller(Coach theCoach){
//        myCoach = theCoach;
//    }

    @Autowired
    public void whatEverIWantitToBE(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
