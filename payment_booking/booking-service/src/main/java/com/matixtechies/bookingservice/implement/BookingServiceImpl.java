package com.matixtechies.bookingservice.implement;

import com.matixtechies.bookingservice.dtos.BookingDto;
import com.matixtechies.bookingservice.dtos.PaymentDto;
import com.matixtechies.bookingservice.dtos.ResponseDto;
import com.matixtechies.bookingservice.model.Booking;
import com.matixtechies.bookingservice.repository.BookingRepository;
import com.matixtechies.bookingservice.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class BookingServiceImpl extends BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    private RestTemplate restTemplate;

    @Override
    public Booking saveBooking(Booking booking){
        return bookingRepository.save(booking);
    }
    @Override
    public ResponseDto getBooking(int bookingId){
        ResponseDto responseDto =new ResponseDto();
        Booking booking =bookingRepository.findById(bookingId).get();
        BookingDto bookingDto = mapToBooking(booking);

        ResponseEntity<PaymentDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8074/api/payments/"+ booking.getPaymentId(),
                        PaymentDto.class);

        PaymentDto paymentDto = responseEntity.getBody();
        System.out.println(responseEntity.getStatusCode());

        responseDto.setBooking(bookingDto);
        responseDto.setPayment(paymentDto);

        return responseDto;
    }
    private BookingDto mapToBooking(Booking booking){
        BookingDto bookingDto =new BookingDto();
        bookingDto.setId(booking.getId());
        bookingDto.setStudentName(booking.getStudentName());
        bookingDto.setStudentPhone(booking.getStudentPhone());
        bookingDto.setBookingDate(booking.getBookingDate());

        return bookingDto;
    }
}
