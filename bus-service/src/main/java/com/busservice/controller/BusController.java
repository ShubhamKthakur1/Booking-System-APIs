package com.busservice.controller;


import com.busservice.model.BookingDetail;
import com.busservice.model.BusDetail;
import com.busservice.repository.BusRepository;
import com.busservice.service.busService.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;


    @Autowired
    BusRepository busRepository;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/addBus")
    public BusDetail createBus(@RequestBody BusDetail bus) throws Exception {
        System.out.println("Getting Here");
        return this.busService.createBus(bus);
    }

    @GetMapping("/{busId}")
    public BusDetail getBusDetail(@PathVariable Long busId) {
        return this.busService.getBusDetail(busId);
    }

    @GetMapping("/search/{fromCity}/{toCity}")
    public List<BusDetail> searchFlightByFromCityAndToCity(@PathVariable String fromCity, @PathVariable String toCity) {
        return (List<BusDetail>) this.busRepository.searchBusByFromCityAndToCity(fromCity,toCity);
    }

    @PostMapping("/booking")
    public void createBooking(@RequestBody BookingDetail booking) throws Exception {

        ResponseEntity<BookingDetail> result = restTemplate.postForEntity("http://localhost:8098/booking/", booking, BookingDetail.class);

    }

}

