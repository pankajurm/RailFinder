package com.pankaj.Train.service;

import com.pankaj.Train.entity.Train;
import com.pankaj.Train.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    private TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository)
    {
        this.trainRepository = trainRepository;
    }


    public List<Train> getAllTrains()
    {
        return trainRepository.findAll();
    }

    public Train addTrain(Train train)
    {
        return trainRepository.save(train);
    }
}
