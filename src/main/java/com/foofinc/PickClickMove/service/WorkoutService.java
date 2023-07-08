package com.foofinc.PickClickMove.service;

import com.foofinc.PickClickMove.service.exercise.Equipment;
import com.foofinc.PickClickMove.service.exercise.Exercise;
import com.foofinc.PickClickMove.service.exercise.Region;
import com.foofinc.PickClickMove.service.workout.WorkOutFactoryInterface;
import com.foofinc.PickClickMove.service.workout.Workout;
import com.foofinc.PickClickMove.service.workout.WorkoutFactoryOrder;
import com.foofinc.PickClickMove.repository.InMemoryRepository;
import com.foofinc.PickClickMove.repository.WorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    private final WorkOutFactoryInterface workOutFactoryInterface;

    private final InMemoryRepository inMemoryRepository;

    public WorkoutService() {
        workoutRepository = new WorkoutRepository();
        inMemoryRepository = new InMemoryRepository();
        workOutFactoryInterface = new WorkOutFactoryInterface(inMemoryRepository.getExercises());
    }


    public List<Exercise> getAllExercises() {
        return inMemoryRepository.getExercises();
    }

    public Workout getWorkout(WorkoutFactoryOrder order) {
        if (order.equipment() == null && order.regions() == null) {
            return getRandomWorkout(order);
        } else {
            return getParameterizedWorkout(order);
        }
    }

    private Workout getParameterizedWorkout(WorkoutFactoryOrder order) {
        return workOutFactoryInterface.getParameterizedWorkout(order);
    }

    private Workout getRandomWorkout(WorkoutFactoryOrder order) {
        return workOutFactoryInterface.getRandomWorkout(order);
    }

    public Region[] getRegions(){
        return Region.values();
    }

    public Equipment[] getEquipment() {
        return Equipment.values();
    }
}
