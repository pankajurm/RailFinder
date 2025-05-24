package com.pankaj.Train.controller;


import com.pankaj.Train.entity.Station;
import com.pankaj.Train.entity.Train;
import com.pankaj.Train.entity.TrainSchedule;
import com.pankaj.Train.repo.StationRepository;
import com.pankaj.Train.repo.TrainRepository;
import com.pankaj.Train.repo.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    StationRepository stationRepository;

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    TrainScheduleRepository trainScheduleRepository;

    @GetMapping
    public void test()
    {

        //train katni to jabalpur
        /*Train rewaSatal = new Train(null,"Rewa-Jabalpur-Express","11706",null);
        Train SecunderabadExpress  = new Train(null,"Secunderabad-SF-Express","12792",null);
        Train KatniBhusaval = new Train(null,"Katni-Bhusaval-Express","11706",null);
        Train ItarsiExpress = new Train(null,"Itarsi-Express","11274",null);
        Train Chitrakoot = new Train(null,"Chitrakoot-Express","15205",null);
        Train Mahakousal = new Train(null,"Mahakousal-Express","12190",null);
        Train Sanghamitra = new Train(null,"Saghamitra-SF-Express","12296",null);
        Train SMVTBangaluru= new Train(null,"SMVT-Bangaluru-SF-Express","22351",null);
        Train VandeBharat = new Train(null,"Rani-Kamalapati-Vande-Bharat-Express","20174",null);
        Train PawanExpress = new Train(null,"Pawan-Express","11062",null);
        Train JabalpurInterCity = new Train(null,"Jabalpur-Intercity-Express","22190",null);
        Train Danapur= new Train(null,"Danapur-Pune-SF-Express","12150",null);
        Train JantaExpress = new Train(null,"Mumbai-LTT-Janta-Express","13201",null);
        Train KatniMemo = new Train(null,"Katni-Itarsi-Memo","61618",null);
        Train Mahanagari = new Train(null,"Mahanagari-SF-Express","22178",null);
        Train HowrahMumbai = new Train(null,"Howrah-Mumbai-CSMT-Mail","12321",null);
        Train MumbaiExpress = new Train(null,"Mumbai-LTT-SF","12168",null);
        Train Kashi = new Train(null,"Kashi-Express","15018",null);
        Train Beena = new Train(null,"Vindhyachal-Express","11272",null);
        Train Godwana = new Train(null,"Godwana-SF-Express","22182",null);
        Train Dayodaya = new Train(null,"Dayodata-SF-Express","12182",null);
        Train Beena = new Train(null,"Vindhyachal-Express","11272",null);
        Train Beena = new Train(null,"Vindhyachal-Express","11272",null);*/

        //stationRepository.saveAll(List.of(katni,jabalpur,delhi,bangalore));


        Station delhi = new Station(null, "New Delhi","NDLS");
        Station mumbai = new Station(null, "Jabalpur","CST");
        Station kolkata = new Station(null, "Kolkata","KOAA");
        Station chennai = new Station(null, "Chennai Central","MAS");

        stationRepository.saveAll(List.of(delhi,mumbai,kolkata,chennai));

        Train rajDhani = new Train(null,"Rajdhani Express","12306",null);
        Train duranto = new Train(null,"Duranto Express","12260",null);
        Train shatabdi = new Train(null,"Shatabdi Express","12043",null);

        trainRepository.saveAll(List.of(rajDhani,duranto,shatabdi));

        TrainSchedule sc1 = new TrainSchedule(null,rajDhani,"06:00","14:00",delhi,mumbai);
        TrainSchedule sc2 = new TrainSchedule(null,duranto,"08:00","21:00",mumbai,kolkata);
        TrainSchedule sc3 = new TrainSchedule(null,shatabdi,"11:30","20:00",kolkata,chennai);

        trainScheduleRepository.saveAll(List.of(sc1,sc2,sc3));

        System.out.println("Data inserted in database");

    }



}
