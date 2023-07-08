package com.foofinc.PickClickMove.controller;

import com.foofinc.PickClickMove.service.WorkoutService;
import com.foofinc.PickClickMove.service.exercise.Equipment;
import com.foofinc.PickClickMove.service.exercise.Exercise;
import com.foofinc.PickClickMove.service.exercise.Region;
import com.foofinc.PickClickMove.service.workout.Workout;
import com.foofinc.PickClickMove.service.workout.WorkoutFactoryOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkoutController {

    private final WorkoutService workoutService;


    public WorkoutController() {
        workoutService = new WorkoutService();
    }

    @GetMapping("/exercises")
    public ResponseEntity<List<Exercise>> getExercises() {
        return new ResponseEntity<>(workoutService.getAllExercises(), HttpStatus.OK);
    }

    @GetMapping("/regions")
    public ResponseEntity<Region[]> getRegions() {
        return new ResponseEntity<>(workoutService.getRegions(), HttpStatus.OK);
    }

    @GetMapping("/equipment")
    public ResponseEntity<Equipment[]> getEquipment() {
        return new ResponseEntity<>(workoutService.getEquipment(), HttpStatus.OK);
    }

    @GetMapping(value = "/workout", consumes = "application/json")
    public ResponseEntity<Workout> getWorkout(@RequestBody WorkoutFactoryOrder order) {
        return new ResponseEntity<>(workoutService.getWorkout(order), HttpStatus.OK);
    }
}
