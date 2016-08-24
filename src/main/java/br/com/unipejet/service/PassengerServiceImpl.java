package br.com.unipejet.service;


import br.com.unipejet.dao.PassengerDao;
import br.com.unipejet.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("passengerService")
@Transactional
public class PassengerServiceImpl implements  PassengerService {

    @Autowired
    PassengerDao passengerDao;

    @Override
    public Passenger findById(int id) {
        return passengerDao.findById(id);
    }

    @Override
    public void save(Passenger passenger) {
        passengerDao.save(passenger);
    }

    @Override
    public void delete(int id) {
        passengerDao.delete(id);
    }

    @Override
    public List<Passenger> findAllPassenger() {
        return passengerDao.findAllPassenger();
    }
}
