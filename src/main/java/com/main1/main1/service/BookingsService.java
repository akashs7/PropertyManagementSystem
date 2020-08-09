package com.main1.main1.service;

import com.main1.main1.models.Bookings;
import com.main1.main1.repository.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("bookingsService")
public class BookingsService implements IBookingsService {

    @Autowired
    BookingsRepository bookingsRepo;

    @Override
    public List<Bookings> getBookings(){
        List<Bookings> bookings = new ArrayList<>();
        Iterable<Bookings> itr = bookingsRepo.findAll();
        if (itr != null){
            for (Bookings b: itr)
                bookings.add(b);
        }

        return bookings;
    }

    @Override
    public Bookings addBooking(Bookings booking){
        return bookingsRepo.save(booking);
    }
}
