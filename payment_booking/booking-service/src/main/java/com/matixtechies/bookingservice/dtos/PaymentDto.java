package com.matixtechies.bookingservice.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private int id;
    private String price;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date paymentDate;
}
