package com.matixtechies.hostelservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Room {
    private String roomName;
    private int roomCapacity;
}
