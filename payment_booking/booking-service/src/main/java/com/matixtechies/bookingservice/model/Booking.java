package com.matixtechies.bookingservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "booking_records")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String studentName;
    private String studentPhone;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date bookingDate;
    private int paymentId;
}
