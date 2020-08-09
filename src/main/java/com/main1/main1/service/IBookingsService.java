package com.main1.main1.service;

import com.main1.main1.models.Bookings;

import java.util.ArrayList;
import java.util.List;

public interface IBookingsService {

    public default List<Bookings> getBookings(){
        return new ArrayList<>();
    }

    public default Bookings addBooking(Bookings bookings){
        return null;
    }
}
