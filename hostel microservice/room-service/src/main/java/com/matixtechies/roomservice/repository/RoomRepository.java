package com.matixtechies.roomservice.repository;

import com.matixtechies.roomservice.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
