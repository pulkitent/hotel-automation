package com.hotel.domain.entities;

import com.hotel.domain.constants.MotionType;

/* This class represents movement with the floor and corridor on which that movement occurred */
public class Motion {
    private final Floor floor;
    private final Corridor corridor;
    private final MotionType type;

    public Motion(Floor floor, Corridor corridor, MotionType type) {
        this.floor = floor;
        this.corridor = corridor;
        this.type = type;
    }

    public Corridor getCorridor() {
        return corridor;
    }

    public MotionType getType() {
        return type;
    }

    public Floor getFloor() {
        return floor;
    }
}