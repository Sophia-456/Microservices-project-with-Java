package com.matixtechies.roomservice.impement;

import com.matixtechies.roomservice.dtos.ResponseDto;
import com.matixtechies.roomservice.dtos.RoomDto;
import com.matixtechies.roomservice.dtos.StudentDto;
import com.matixtechies.roomservice.model.Room;
import com.matixtechies.roomservice.repository.RoomRepository;
import com.matixtechies.roomservice.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class RoomServiceImpl extends RoomService {
    private RoomRepository roomRepository;
    private RestTemplate restTemplate;

    public Room addRoom(Room room){
        return roomRepository.save(room);
    }
    public ResponseDto getRoom(int roomId){
        ResponseDto responseDto = new ResponseDto();
        Room room = roomRepository.findById(roomId).get();
        RoomDto roomDto = mapToRoom(room);

        ResponseEntity<StudentDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8072/api/students/"+ room.getStudentId(), StudentDto.class);
        StudentDto studentDto = responseEntity.getBody();
        System.out.println(responseEntity.getStatusCode());

        responseDto.setRoom(roomDto);
        responseDto.setStudent(studentDto);
        return responseDto;
    }
    private RoomDto mapToRoom(Room room){
        RoomDto roomDto = new RoomDto();
        roomDto.setId(room.getId());
        roomDto.setRoomName(room.getRoomName());
        roomDto.setRoomType(room.getRoomType());
        return roomDto;
    }

}
