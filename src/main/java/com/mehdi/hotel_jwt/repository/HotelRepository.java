package com.mehdi.hotel_jwt.repository;

import com.mehdi.hotel_jwt.entity.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotels,Long> {
}
