package com.foofinc.PickClickMove.controller;

import com.foofinc.PickClickMove.service.WorkoutService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkoutController {

    private final WorkoutService workoutService;

    public WorkoutController() {
        workoutService = new WorkoutService();
    }

    @GetMapping("/workout")
    public ResponseEntity<String> getWorkout() {
        String s = workoutService.getWorkout();

        return new ResponseEntity<>(s, HttpStatus.OK);
    }


}
