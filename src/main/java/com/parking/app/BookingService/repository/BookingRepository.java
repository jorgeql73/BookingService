package com.parking.app.BookingService.repository;

import com.parking.app.BookingService.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    //public Booking getBookingFindCustomer(Customer customer);
}
