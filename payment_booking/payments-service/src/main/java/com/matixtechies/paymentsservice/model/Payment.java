package com.matixtechies.paymentsservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "payment_records")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String price;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date paymentDate;
}

