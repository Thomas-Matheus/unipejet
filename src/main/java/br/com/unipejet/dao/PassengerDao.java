package br.com.unipejet.dao;

import br.com.unipejet.entity.Passenger;

import java.util.List;

public interface PassengerDao {

    Passenger findById(int id);

    void save(Passenger passenger);

    void delete(int id);

    List<Passenger> findAllPassenger();

}
