package com.foofinc.PickClickMove.service.workout;


import com.foofinc.PickClickMove.service.exercise.Equipment;
import com.foofinc.PickClickMove.service.exercise.Exercise;
import com.foofinc.PickClickMove.service.exercise.Region;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ParameterizedWorkoutFactory extends AbstractWorkoutFactory {

    private final int numberOfExercises;
    private final List<Region> regions;
    private final List<Equipment> equipment;
    private final boolean repeatExercise;

    private ParameterizedWorkoutFactory(WorkoutFactoryOrder order, List<Exercise> exercises) {
        super(exercises);
        regions = order.regions();
        equipment = order.equipment();
        numberOfExercises = order.numberOfExercises();
        repeatExercise = order.isRepeat();
    }

    static AbstractWorkoutFactory getFactory(WorkoutFactoryOrder order, List<Exercise> exercises) {
        return new ParameterizedWorkoutFactory(order, exercises);
    }

    @Override
    Workout create() {

        Predicate<Exercise> containsRegion = ex -> {
            if (regions == null) return true;
            for (Region r : ex.getMuscleRegions()) {
                if (regions.contains(r)) return true;
            }
            return false;
        };
        Predicate<Exercise> requiresEquipment = ex -> {
            if (equipment == null) return true;
            for (Equipment e : ex.getEquipmentNeeded()) {
                if (equipment.contains(e)) return true;
            }
            return false;
        };

        List<Exercise> validExercises = exercises.stream()
                                                 .filter(containsRegion)
                                                 .filter(requiresEquipment)
                                                 .collect(Collectors.toCollection(ArrayList::new));

        return buildWorkout(validExercises, numberOfExercises, repeatExercise);
    }
}
