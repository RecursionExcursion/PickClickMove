package com.foofinc.PickClickMove.repository;

import com.foofinc.PickClickMove.service.exercise.Exercise;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryRepository {

    public List<Exercise> getExercises(){
        return ExerciseInit.getExercises();
    }

}
