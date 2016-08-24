package br.com.unipejet.dao;

import br.com.unipejet.entity.Seats;

import java.util.List;

public interface SeatsDao {

    Seats findById(int id);

    void save(Seats seats);

    void delete(int id);

    List<Seats> findAllSeats();

}
