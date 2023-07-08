package com.foofinc.PickClickMove.service.workout;


import com.foofinc.PickClickMove.service.exercise.Exercise;

import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

abstract class AbstractWorkoutFactory {

    protected List<Exercise> exercises;

    AbstractWorkoutFactory(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    abstract Workout create();

    Workout buildWorkout(List<Exercise> exercises, int numOfExercises, boolean repeatExercise) {
        Workout workout = new Workout();
        Random rand = new Random();

        BiFunction<Boolean, Integer, Exercise> getOrRemoveExercise = (isRepeat, i) ->
                isRepeat ? exercises.get(i) : exercises.remove((int) i);

        while (!exercises.isEmpty() && workout.getExercises().size() < numOfExercises) {
            int i = rand.nextInt(exercises.size());
            workout.addExercisesToWorkout(getOrRemoveExercise.apply(repeatExercise, i));
        }
        return workout;
    }
}
