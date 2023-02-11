package matixtechie.studentservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    private String id;
    private String roomName;
    private String roomType;
    private String hostelName;
}
