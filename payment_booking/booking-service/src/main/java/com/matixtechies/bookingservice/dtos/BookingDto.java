package com.matixtechies.bookingservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    private int id;
    private String studentName;
    private String studentPhone;
    private Date bookingDate;
    private int paymentId;
}
