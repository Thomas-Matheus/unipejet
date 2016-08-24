package br.com.unipejet.service;

import br.com.unipejet.entity.Passenger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface PassengerService {

    Passenger findById(int id);

    void save(Passenger passenger);

    void delete(int id);

    List<Passenger> findAllPassenger();
}
