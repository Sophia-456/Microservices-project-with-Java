package com.matixtechies.bookingservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private PaymentDto payment;
    private BookingDto booking;
}
