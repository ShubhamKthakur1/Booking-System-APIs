package com.busservice.service.busService;

import com.busservice.model.BusDetail;
import org.springframework.beans.factory.annotation.Autowired;
import com.busservice.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BusServiceImp implements BusService {

    @Autowired
    private BusRepository BusRepository;


    @Override
    public BusDetail createBus(BusDetail bus) throws Exception {
        BusDetail local = null;
        if(bus.getBusId() != null)
            local = getBusDetail(bus.getBusId());
        if(local !=null){
            System.out.println("BusId is already there !!");
            throw new Exception("BusId already present !!");
        }else{
            //user create
            local = this.BusRepository.save(bus);
        }
        return local;
    }

    @Override
    public BusDetail getBusDetail(long busId) {
        if(BusRepository.findById(busId).isPresent())
            return BusRepository.findById(busId).get();
        else return new BusDetail();
    }


}

