package com.busservice.service.busService;


import com.busservice.model.BusDetail;

import java.util.Optional;

public interface BusService {
    public BusDetail createBus(BusDetail bus) throws Exception;

    public BusDetail getBusDetail(long BusId);

}