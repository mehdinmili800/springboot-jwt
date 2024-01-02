package com.mehdi.hotel_jwt.controller.hotels;

import com.mehdi.hotel_jwt.entity.Hotels;
import com.mehdi.hotel_jwt.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels-security")
public class HotelsSecurityController {

    @Autowired
     private HotelService hotelService;

    @PostMapping("/save")
    public ResponseEntity<Hotels> addHotel(@RequestBody Hotels hotels){
        Hotels hotels1 = hotelService.addHotel(hotels);
        return new ResponseEntity<Hotels>(hotels1, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        hotelService.deleteHotelById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Hotels> updateById(@PathVariable("id") Long id,@RequestBody Hotels hotels){
        hotels.setHotelId(id);
        Hotels hotelsUpdate = hotelService.updateHotel(id,hotels);
        return  new ResponseEntity<Hotels>(hotelsUpdate,HttpStatus.OK);
    }
}
