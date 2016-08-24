package br.com.unipejet.service;

import br.com.unipejet.dao.TravelDao;
import br.com.unipejet.entity.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("travelService")
@Transactional
public class TravelServiceImpl implements TravelService {

    @Autowired
    TravelDao travelDao;

    @Override
    public Travel findById(int id) {
        return travelDao.findById(id);
    }

    @Override
    public void save(Travel travel) {
        travelDao.save(travel);
    }

    @Override
    public void delete(int id) {
        travelDao.delete(id);
    }

    @Override
    public List<Travel> findAllTravel() {
        return travelDao.findAllTravel();
    }
}
