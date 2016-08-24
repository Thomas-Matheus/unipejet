package br.com.unipejet.service;


import br.com.unipejet.entity.Seats;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface SeatsService {

    Seats findById(int id);

    void save(Seats seats);

    void delete(int id);

    List<Seats> findAllSeats();

}
