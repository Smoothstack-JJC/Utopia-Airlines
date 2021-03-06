package com.smoothstack.utopiaairlines.dao;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smoothstack.utopiaairlines.entities.Airplane;

@Repository
public interface AirplaneDao  extends JpaRepository<Airplane, Integer> {

}
