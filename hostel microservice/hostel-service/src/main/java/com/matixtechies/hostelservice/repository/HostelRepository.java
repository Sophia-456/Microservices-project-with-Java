package com.matixtechies.hostelservice.repository;

import com.matixtechies.hostelservice.model.Hostel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HostelRepository extends MongoRepository<Hostel, Integer> {
    List<Hostel> findByName(String name);
}
