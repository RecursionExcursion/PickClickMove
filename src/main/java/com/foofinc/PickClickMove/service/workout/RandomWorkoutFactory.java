package com.foofinc.PickClickMove.service.workout;


import com.foofinc.PickClickMove.service.exercise.Exercise;

import java.util.List;

class RandomWorkoutFactory extends AbstractWorkoutFactory {

    private final int numberOfExercises;
    private final boolean repeatExercise;

    private final List<Exercise> validExercises = exercises;

    private RandomWorkoutFactory(WorkoutFactoryOrder order, List<Exercise> exercises) {
        super(exercises);
        numberOfExercises = order.numberOfExercises();
        repeatExercise = order.isRepeat();
    }

    static AbstractWorkoutFactory getFactory(WorkoutFactoryOrder order, List<Exercise> exercises) {
        return new RandomWorkoutFactory(order, exercises);
    }

    @Override
    Workout create() {
        return buildWorkout(validExercises, numberOfExercises, repeatExercise);
    }
}
