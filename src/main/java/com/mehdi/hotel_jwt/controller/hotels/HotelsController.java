package com.mehdi.hotel_jwt.controller.hotels;

import com.mehdi.hotel_jwt.entity.Hotels;
import com.mehdi.hotel_jwt.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelsController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public ResponseEntity<List<Hotels>> getAllHotels(){
        List<Hotels> allHotels = hotelService.findAllHotels();
        return new ResponseEntity<List<Hotels>>(allHotels, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Hotels> getHotelById(@PathVariable("id") Long id){
        Hotels hotelById=hotelService.getHotelById(id);
        return new ResponseEntity<Hotels>(hotelById,HttpStatus.OK);
    }


}
