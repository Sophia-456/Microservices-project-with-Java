package com.matixtechies.hostelservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "hostel_records")
public class Hostel {
    @Id
    private int id;
    private String name;
    private String hostelType;
    private int capacity;
    private List<Room> rooms;

}
