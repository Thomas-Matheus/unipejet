package br.com.unipejet.dao;

import br.com.unipejet.entity.Travel;

import java.util.List;

public interface TravelDao {

    Travel findById(int id);

    void save(Travel travel);

    void delete(int id);

    List<Travel> findAllTravel();
}

