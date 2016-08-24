package br.com.unipejet.service;


import br.com.unipejet.dao.SeatsDao;
import br.com.unipejet.entity.Seats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("seatsService")
@Transactional
public class SeatsServiceImpl implements SeatsService {

    @Autowired
    SeatsDao seatsDao;

    @Override
    public Seats findById(int id) {
        return seatsDao.findById(id);
    }

    @Override
    public void save(Seats seats) {
        seatsDao.save(seats);
    }

    @Override
    public void delete(int id) {
        seatsDao.delete(id);
    }

    @Override
    public List<Seats> findAllSeats() {
        return seatsDao.findAllSeats();
    }
}
