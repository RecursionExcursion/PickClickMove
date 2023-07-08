package com.foofinc.PickClickMove.service.workout;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.foofinc.PickClickMove.service.exercise.Equipment;
import com.foofinc.PickClickMove.service.exercise.Region;

import java.util.List;

public record WorkoutFactoryOrder(@JsonProperty int numberOfExercises,
                                  @JsonProperty List<Region> regions,
                                  @JsonProperty List<Equipment> equipment,
                                  @JsonProperty boolean isRepeat) {
}
