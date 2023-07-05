package com.foofinc.PickClickMove.service;

import com.foofinc.PickClickMove.repository.WorkoutRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;
    public WorkoutService() {
        workoutRepository = new WorkoutRepository();
    }

    public String getWorkout(){
        return "workout";
    }
}
