package com.matixtechies.roomservice.controller;

import com.matixtechies.roomservice.dtos.ResponseDto;
import com.matixtechies.roomservice.model.Room;
import com.matixtechies.roomservice.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/rooms")
public class RoomController {
    private RoomService roomService;
    @PostMapping
    public ResponseEntity<Room> addRoom(@RequestBody Room room){
        Room addedRoom = roomService.addRoom(room);
        return new ResponseEntity<>(addedRoom, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getRoom(@PathVariable("id") int roomId) {
        ResponseDto responseDto = roomService.getRoom(roomId);
        return ResponseEntity.ok(responseDto);
    }
}
