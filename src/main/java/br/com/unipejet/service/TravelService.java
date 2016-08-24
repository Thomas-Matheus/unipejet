package br.com.unipejet.service;

import br.com.unipejet.entity.Travel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TravelService {

    Travel findById(int id);

    void save(Travel travel);

    void delete(int id);

    List<Travel> findAllTravel();

}
