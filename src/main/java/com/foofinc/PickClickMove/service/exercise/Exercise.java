package com.foofinc.PickClickMove.service.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {

    private String name;
    private String description;

    private List<Region> muscleRegions = new ArrayList<>();
    private List<Equipment> equipmentNeeded = new ArrayList<>();

    public Exercise() {
    }

    public Exercise(String name, String description, Equipment[] equipment, Region[] regions) {
        this.name = name;
        this.description = description;
        muscleRegions.addAll(Arrays.asList(regions));
        equipmentNeeded.addAll(Arrays.asList(equipment));
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Region> getMuscleRegions() {
        return muscleRegions;
    }

    public List<Equipment> getEquipmentNeeded() {
        return equipmentNeeded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMuscleRegions(List<Region> muscleRegions) {
        this.muscleRegions = muscleRegions;
    }

    public void setEquipmentNeeded(List<Equipment> equipmentNeeded) {
        this.equipmentNeeded = equipmentNeeded;
    }

}
