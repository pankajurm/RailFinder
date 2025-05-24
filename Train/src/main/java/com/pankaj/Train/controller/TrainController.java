package com.pankaj.Train.controller;


import com.pankaj.Train.entity.Station;
import com.pankaj.Train.entity.Train;
import com.pankaj.Train.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    private TrainService trainService;
    public TrainController(TrainService trainService)
    {
        this.trainService = trainService;
    }

    @GetMapping
    public List<Train> getAllTrains()
    {
        return trainService.getAllTrains();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train)
    {
        return trainService.addTrain(train);
    }
}
