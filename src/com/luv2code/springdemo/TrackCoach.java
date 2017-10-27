package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    public TrackCoach() {
        
    }
    
    // define a private field for he dependency
    private FortuneService fortuneService;
    
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

}
