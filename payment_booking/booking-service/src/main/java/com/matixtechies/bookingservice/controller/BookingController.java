package com.matixtechies.bookingservice.controller;

import com.matixtechies.bookingservice.dtos.ResponseDto;
import com.matixtechies.bookingservice.model.Booking;
import com.matixtechies.bookingservice.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bookings")
@AllArgsConstructor
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking){
        Booking savedBooking = bookingService.saveBooking(booking);
        return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getBooking(@PathVariable("id") int bookingId){
        ResponseDto responseDto = bookingService.getBooking(bookingId);
        return ResponseEntity.ok(responseDto);
    }
}
