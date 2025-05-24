package com.pankaj.Train.repo;

import com.pankaj.Train.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station,Long> {

}
